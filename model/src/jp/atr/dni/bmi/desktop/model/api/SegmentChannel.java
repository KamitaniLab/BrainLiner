package jp.atr.dni.bmi.desktop.model.api;

import java.util.ArrayList;
import java.util.List;
import jp.atr.dni.bmi.desktop.model.api.data.NSNSegmentData;
import jp.atr.dni.bmi.desktop.neuroshareutils.EntityType;
import jp.atr.dni.bmi.desktop.neuroshareutils.SegmentInfo;
import jp.atr.dni.bmi.desktop.neuroshareutils.SegmentSourceInfo;

/**
 *
 * @author makoto
 */
public final class SegmentChannel implements Channel<NSNSegmentData> {

    private int id;
    private SegmentInfo nsnEntity;
    private NSNSegmentData data;
    private List<SegmentSourceInfo> segmentSources = new ArrayList<SegmentSourceInfo>();

    public SegmentChannel(int id, SegmentInfo nsnEntity) {
        this.id = id;
        this.nsnEntity = nsnEntity;
        this.data = null;

        if (nsnEntity.getSourceCount() > 0) {
            for (int i = 0; i < nsnEntity.getSegSourceInfos().size(); i++) {
                segmentSources.add(nsnEntity.getSegSourceInfos().get(i));
            }
        }
    }

    private void initialize() {
        this.data = new NSNSegmentData(nsnEntity);
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public ChannelType getType() {
        return ChannelType.SEGMENT;
    }

    @Override
    public String getLabel() {
        return nsnEntity.getEntityInfo().getEntityLabel();
    }

    @Override
    public void setLabel(String label) {
        nsnEntity.getEntityInfo().setEntityLabel(label);
    }

    @Override
    public long getItemCount() {
        return nsnEntity.getEntityInfo().getItemCount();
    }

    @Override
    public void setItemCount(long itemCount) {
        nsnEntity.getEntityInfo().setItemCount(itemCount);
    }

    @Override
    public String getURI() {
        return nsnEntity.getEntityInfo().getFilePath();
    }

    public void setURI(String uri) {
        nsnEntity.getEntityInfo().setFilePath(uri);
    }

    @Override
    public NSNSegmentData getData() {
        if (this.data == null) {
            initialize();
        }
        return data;
    }

    /**
     * @return the sourceCount
     */
    public long getSourceCount() {
        return nsnEntity.getSourceCount();
    }

    /**
     * @param sourceCount the sourceCount to set
     */
    public void setSourceCount(long sourceCount) {
        nsnEntity.setSourceCount(sourceCount);
    }

    /**
     * @return the minSampleCount
     */
    public long getMinSampleCount() {
        return nsnEntity.getMinSampleCount();
    }

    /**
     * @param minSampleCount the minSampleCount to set
     */
    public void setMinSampleCount(long minSampleCount) {
        nsnEntity.setMinSampleCount(minSampleCount);
    }

    /**
     * @return the maxSampleCount
     */
    public long getMaxSampleCount() {
        return nsnEntity.getMaxSampleCount();
    }

    /**
     * @param maxSampleCount the maxSampleCount to set
     */
    public void setMaxSampleCount(long maxSampleCount) {
        nsnEntity.setMaxSampleCount(maxSampleCount);
    }

    /**
     * @return the sampleRate
     */
    public double getSamplingRate() {
        return nsnEntity.getSampleRate();
    }

    /**
     * @param sampleRate the sampleRate to set
     */
    public void setSamplingRate(double samplingRate) {
        nsnEntity.setSampleRate(samplingRate);
    }

    /**
     * @return the units
     */
    public String getUnits() {
        return nsnEntity.getUnits();
    }

    /**
     * @param units the units to set
     */
    public void setUnits(String units) {
        nsnEntity.setUnits(units);
    }

    /**
     * @return the dataPosition
     */
    public long getDataPosition() {
        return nsnEntity.getEntityInfo().getDataPosition();
    }

    /**
     * @param dataPosition the dataPosition to set
     */
    public void setDataPosition(long dataPosition) {
        nsnEntity.getEntityInfo().setDataPosition(dataPosition);
    }

    /**
     * @return the entityType
     */
    public EntityType getEntityType() {
        return nsnEntity.getEntityInfo().getEntityType();
    }

//   /**
//    * @param entityType the entityType to set
//    */
//   public void setEntityType(long entityType) {
//      nsnEntity.getEntityInfo().setEntityType(entityType);
//   }
//
//   /**
//    * @return the segmentSources
//    */
//   public APIList<NSNSegmentSource> getSegmentSources() {
//      return segmentSources;
//   }
//   /**
//    * @param segmentSources the segmentSources to set
//    */
//   public void setSegmentSources(APIList<NSNSegmentSource> segmentSources) {
//   }
    public synchronized SegmentSourceInfo getSegmentSource(int ndx) {
        if (ndx >= 0 && ndx < segmentSources.size()) {
            return segmentSources.get(ndx);
        } else {
            return null;
        }
    }

    public synchronized void setSegmentSource(int ndx, SegmentSourceInfo ssi) {
        if (ndx >= 0 && ndx < segmentSources.size()) {
            segmentSources.set(ndx, ssi);
        }
    }

    public synchronized void removeSegmentSource(int ndx) {
        if (ndx >= 0 && ndx < segmentSources.size()) {
            segmentSources.remove(ndx);
        }
    }

    public synchronized int numSegSources() {
        return segmentSources.size();
    }

    @Override
    public String toString() {
        return getLabel();
    }
}
