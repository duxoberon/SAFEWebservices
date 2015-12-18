
package com.woolpert.safe.webservices;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.woolpert.safe.webservices package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _InsertSensorMFRResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertSensorMFRResponse");
    private final static QName _UpdateSensorMFRResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateSensorMFRResponse");
    private final static QName _UpdateCollection_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateCollection");
    private final static QName _DeleteOrganizationResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteOrganizationResponse");
    private final static QName _GetSpectrumsResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "getSpectrumsResponse");
    private final static QName _GetAssetsForSensorResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "getAssetsForSensorResponse");
    private final static QName _DeleteCollections_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteCollections");
    private final static QName _UpdateSensorResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateSensorResponse");
    private final static QName _DeleteAsset_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteAsset");
    private final static QName _GetAssetsResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "getAssetsResponse");
    private final static QName _UpdateOrganization_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateOrganization");
    private final static QName _DeleteSpectrumResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteSpectrumResponse");
    private final static QName _InsertAssetResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertAssetResponse");
    private final static QName _DeleteCollectionsResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteCollectionsResponse");
    private final static QName _GetCollections_QNAME = new QName("http://webservices.safe.woolpert.com/", "getCollections");
    private final static QName _GetPlatformsResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "getPlatformsResponse");
    private final static QName _DeletePOC_QNAME = new QName("http://webservices.safe.woolpert.com/", "deletePOC");
    private final static QName _InsertCollection_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertCollection");
    private final static QName _DeleteSensorMetadata_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteSensorMetadata");
    private final static QName _GetSensorsResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "getSensorsResponse");
    private final static QName _InsertSensorMetadataResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertSensorMetadataResponse");
    private final static QName _DeleteSensorMFR_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteSensorMFR");
    private final static QName _AddSensorToAssetResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "addSensorToAssetResponse");
    private final static QName _InsertSensorMetadata_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertSensorMetadata");
    private final static QName _GetPOCs_QNAME = new QName("http://webservices.safe.woolpert.com/", "getPOCs");
    private final static QName _InsertPlatform_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertPlatform");
    private final static QName _DeletePlatformResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "deletePlatformResponse");
    private final static QName _InsertPlatformResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertPlatformResponse");
    private final static QName _DeleteSensor_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteSensor");
    private final static QName _DeleteOrganization_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteOrganization");
    private final static QName _UpdatePlatform_QNAME = new QName("http://webservices.safe.woolpert.com/", "updatePlatform");
    private final static QName _UpdateAssetResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateAssetResponse");
    private final static QName _DeleteSensorResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteSensorResponse");
    private final static QName _InsertOrganizationResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertOrganizationResponse");
    private final static QName _UpdateSpectrum_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateSpectrum");
    private final static QName _GetPOCsResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "getPOCsResponse");
    private final static QName _DeletePlatform_QNAME = new QName("http://webservices.safe.woolpert.com/", "deletePlatform");
    private final static QName _InsertSpectrum_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertSpectrum");
    private final static QName _InsertPOC_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertPOC");
    private final static QName _UpdatePOCResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "updatePOCResponse");
    private final static QName _DeleteSpectrum_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteSpectrum");
    private final static QName _InsertSensorMFR_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertSensorMFR");
    private final static QName _UpdateSensorMetadata_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateSensorMetadata");
    private final static QName _InsertAsset_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertAsset");
    private final static QName _InsertSensor_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertSensor");
    private final static QName _UpdateSensor_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateSensor");
    private final static QName _GetSpectrums_QNAME = new QName("http://webservices.safe.woolpert.com/", "getSpectrums");
    private final static QName _GetOrganizationsResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "getOrganizationsResponse");
    private final static QName _InsertOrganization_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertOrganization");
    private final static QName _UpdateAsset_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateAsset");
    private final static QName _UpdateOrganizationResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateOrganizationResponse");
    private final static QName _DeleteSensorMetadataResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteSensorMetadataResponse");
    private final static QName _DeleteSensorMFRResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteSensorMFRResponse");
    private final static QName _UpdatePlatformResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "updatePlatformResponse");
    private final static QName _GetAllSensorMetadataResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "getAllSensorMetadataResponse");
    private final static QName _GetPlatforms_QNAME = new QName("http://webservices.safe.woolpert.com/", "getPlatforms");
    private final static QName _DeletePOCResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "deletePOCResponse");
    private final static QName _GetAllSensorMetadata_QNAME = new QName("http://webservices.safe.woolpert.com/", "getAllSensorMetadata");
    private final static QName _InsertCollectionResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertCollectionResponse");
    private final static QName _GetAssetsForSensor_QNAME = new QName("http://webservices.safe.woolpert.com/", "getAssetsForSensor");
    private final static QName _UpdateCollectionResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateCollectionResponse");
    private final static QName _GetSensors_QNAME = new QName("http://webservices.safe.woolpert.com/", "getSensors");
    private final static QName _InsertSpectrumResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertSpectrumResponse");
    private final static QName _AddSensorToAsset_QNAME = new QName("http://webservices.safe.woolpert.com/", "addSensorToAsset");
    private final static QName _AddAssetToSensorResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "addAssetToSensorResponse");
    private final static QName _DeleteAssetResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "deleteAssetResponse");
    private final static QName _GetSensorsForAsset_QNAME = new QName("http://webservices.safe.woolpert.com/", "getSensorsForAsset");
    private final static QName _UpdateSensorMFR_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateSensorMFR");
    private final static QName _GetAssets_QNAME = new QName("http://webservices.safe.woolpert.com/", "getAssets");
    private final static QName _UpdateSpectrumResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateSpectrumResponse");
    private final static QName _GetCollectionsResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "getCollectionsResponse");
    private final static QName _GetSensorsForAssetResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "getSensorsForAssetResponse");
    private final static QName _GetOrganizations_QNAME = new QName("http://webservices.safe.woolpert.com/", "getOrganizations");
    private final static QName _GetSensorMFRs_QNAME = new QName("http://webservices.safe.woolpert.com/", "getSensorMFRs");
    private final static QName _InsertSensorResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertSensorResponse");
    private final static QName _UpdatePOC_QNAME = new QName("http://webservices.safe.woolpert.com/", "updatePOC");
    private final static QName _GetSensorMFRsResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "getSensorMFRsResponse");
    private final static QName _InsertPOCResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "insertPOCResponse");
    private final static QName _UpdateSensorMetadataResponse_QNAME = new QName("http://webservices.safe.woolpert.com/", "updateSensorMetadataResponse");
    private final static QName _AddAssetToSensor_QNAME = new QName("http://webservices.safe.woolpert.com/", "addAssetToSensor");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.woolpert.safe.webservices
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link InsertSpectrumResponse }
     * 
     */
    public InsertSpectrumResponse createInsertSpectrumResponse() {
        return new InsertSpectrumResponse();
    }

    /**
     * Create an instance of {@link AddSensorToAssetResponse }
     * 
     */
    public AddSensorToAssetResponse createAddSensorToAssetResponse() {
        return new AddSensorToAssetResponse();
    }

    /**
     * Create an instance of {@link DeleteOrganization }
     * 
     */
    public DeleteOrganization createDeleteOrganization() {
        return new DeleteOrganization();
    }

    /**
     * Create an instance of {@link DeletePlatformResponse }
     * 
     */
    public DeletePlatformResponse createDeletePlatformResponse() {
        return new DeletePlatformResponse();
    }

    /**
     * Create an instance of {@link GetAssetsForSensorResponse }
     * 
     */
    public GetAssetsForSensorResponse createGetAssetsForSensorResponse() {
        return new GetAssetsForSensorResponse();
    }

    /**
     * Create an instance of {@link GetAssetsForSensor }
     * 
     */
    public GetAssetsForSensor createGetAssetsForSensor() {
        return new GetAssetsForSensor();
    }

    /**
     * Create an instance of {@link InsertPlatformResponse }
     * 
     */
    public InsertPlatformResponse createInsertPlatformResponse() {
        return new InsertPlatformResponse();
    }

    /**
     * Create an instance of {@link Asset }
     * 
     */
    public Asset createAsset() {
        return new Asset();
    }

    /**
     * Create an instance of {@link InsertPlatform }
     * 
     */
    public InsertPlatform createInsertPlatform() {
        return new InsertPlatform();
    }

    /**
     * Create an instance of {@link DeleteSpectrumResponse }
     * 
     */
    public DeleteSpectrumResponse createDeleteSpectrumResponse() {
        return new DeleteSpectrumResponse();
    }

    /**
     * Create an instance of {@link SensorMetadata }
     * 
     */
    public SensorMetadata createSensorMetadata() {
        return new SensorMetadata();
    }

    /**
     * Create an instance of {@link InsertOrganization }
     * 
     */
    public InsertOrganization createInsertOrganization() {
        return new InsertOrganization();
    }

    /**
     * Create an instance of {@link DeleteSensorMetadataResponse }
     * 
     */
    public DeleteSensorMetadataResponse createDeleteSensorMetadataResponse() {
        return new DeleteSensorMetadataResponse();
    }

    /**
     * Create an instance of {@link GetSensorMFRsResponse }
     * 
     */
    public GetSensorMFRsResponse createGetSensorMFRsResponse() {
        return new GetSensorMFRsResponse();
    }

    /**
     * Create an instance of {@link UpdateAsset }
     * 
     */
    public UpdateAsset createUpdateAsset() {
        return new UpdateAsset();
    }

    /**
     * Create an instance of {@link UpdateSensorMFRResponse }
     * 
     */
    public UpdateSensorMFRResponse createUpdateSensorMFRResponse() {
        return new UpdateSensorMFRResponse();
    }

    /**
     * Create an instance of {@link UpdateCollection }
     * 
     */
    public UpdateCollection createUpdateCollection() {
        return new UpdateCollection();
    }

    /**
     * Create an instance of {@link Organization }
     * 
     */
    public Organization createOrganization() {
        return new Organization();
    }

    /**
     * Create an instance of {@link UpdatePlatformResponse }
     * 
     */
    public UpdatePlatformResponse createUpdatePlatformResponse() {
        return new UpdatePlatformResponse();
    }

    /**
     * Create an instance of {@link DeleteCollectionsResponse }
     * 
     */
    public DeleteCollectionsResponse createDeleteCollectionsResponse() {
        return new DeleteCollectionsResponse();
    }

    /**
     * Create an instance of {@link DeleteSensor }
     * 
     */
    public DeleteSensor createDeleteSensor() {
        return new DeleteSensor();
    }

    /**
     * Create an instance of {@link GetAssetsResponse }
     * 
     */
    public GetAssetsResponse createGetAssetsResponse() {
        return new GetAssetsResponse();
    }

    /**
     * Create an instance of {@link InsertSensorResponse }
     * 
     */
    public InsertSensorResponse createInsertSensorResponse() {
        return new InsertSensorResponse();
    }

    /**
     * Create an instance of {@link DeleteSensorMFR }
     * 
     */
    public DeleteSensorMFR createDeleteSensorMFR() {
        return new DeleteSensorMFR();
    }

    /**
     * Create an instance of {@link GetAllSensorMetadataResponse }
     * 
     */
    public GetAllSensorMetadataResponse createGetAllSensorMetadataResponse() {
        return new GetAllSensorMetadataResponse();
    }

    /**
     * Create an instance of {@link GetOrganizations }
     * 
     */
    public GetOrganizations createGetOrganizations() {
        return new GetOrganizations();
    }

    /**
     * Create an instance of {@link UpdateOrganizationResponse }
     * 
     */
    public UpdateOrganizationResponse createUpdateOrganizationResponse() {
        return new UpdateOrganizationResponse();
    }

    /**
     * Create an instance of {@link GetSensorsForAssetResponse }
     * 
     */
    public GetSensorsForAssetResponse createGetSensorsForAssetResponse() {
        return new GetSensorsForAssetResponse();
    }

    /**
     * Create an instance of {@link UpdatePOC }
     * 
     */
    public UpdatePOC createUpdatePOC() {
        return new UpdatePOC();
    }

    /**
     * Create an instance of {@link DeletePlatform }
     * 
     */
    public DeletePlatform createDeletePlatform() {
        return new DeletePlatform();
    }

    /**
     * Create an instance of {@link DeleteSensorMFRResponse }
     * 
     */
    public DeleteSensorMFRResponse createDeleteSensorMFRResponse() {
        return new DeleteSensorMFRResponse();
    }

    /**
     * Create an instance of {@link DeleteCollections }
     * 
     */
    public DeleteCollections createDeleteCollections() {
        return new DeleteCollections();
    }

    /**
     * Create an instance of {@link GetSensorsResponse }
     * 
     */
    public GetSensorsResponse createGetSensorsResponse() {
        return new GetSensorsResponse();
    }

    /**
     * Create an instance of {@link DeleteAsset }
     * 
     */
    public DeleteAsset createDeleteAsset() {
        return new DeleteAsset();
    }

    /**
     * Create an instance of {@link UpdatePlatform }
     * 
     */
    public UpdatePlatform createUpdatePlatform() {
        return new UpdatePlatform();
    }

    /**
     * Create an instance of {@link AddSensorToAsset }
     * 
     */
    public AddSensorToAsset createAddSensorToAsset() {
        return new AddSensorToAsset();
    }

    /**
     * Create an instance of {@link GetSensorsForAsset }
     * 
     */
    public GetSensorsForAsset createGetSensorsForAsset() {
        return new GetSensorsForAsset();
    }

    /**
     * Create an instance of {@link GetSensorMFRs }
     * 
     */
    public GetSensorMFRs createGetSensorMFRs() {
        return new GetSensorMFRs();
    }

    /**
     * Create an instance of {@link InsertPOC }
     * 
     */
    public InsertPOC createInsertPOC() {
        return new InsertPOC();
    }

    /**
     * Create an instance of {@link UpdateSensorMFR }
     * 
     */
    public UpdateSensorMFR createUpdateSensorMFR() {
        return new UpdateSensorMFR();
    }

    /**
     * Create an instance of {@link DeletePOC }
     * 
     */
    public DeletePOC createDeletePOC() {
        return new DeletePOC();
    }

    /**
     * Create an instance of {@link InsertSpectrum }
     * 
     */
    public InsertSpectrum createInsertSpectrum() {
        return new InsertSpectrum();
    }

    /**
     * Create an instance of {@link UpdateOrganization }
     * 
     */
    public UpdateOrganization createUpdateOrganization() {
        return new UpdateOrganization();
    }

    /**
     * Create an instance of {@link UpdateSensorMetadata }
     * 
     */
    public UpdateSensorMetadata createUpdateSensorMetadata() {
        return new UpdateSensorMetadata();
    }

    /**
     * Create an instance of {@link GetSpectrumsResponse }
     * 
     */
    public GetSpectrumsResponse createGetSpectrumsResponse() {
        return new GetSpectrumsResponse();
    }

    /**
     * Create an instance of {@link Spectrum }
     * 
     */
    public Spectrum createSpectrum() {
        return new Spectrum();
    }

    /**
     * Create an instance of {@link UpdateSpectrum }
     * 
     */
    public UpdateSpectrum createUpdateSpectrum() {
        return new UpdateSpectrum();
    }

    /**
     * Create an instance of {@link ReturnStatus }
     * 
     */
    public ReturnStatus createReturnStatus() {
        return new ReturnStatus();
    }

    /**
     * Create an instance of {@link SensorMFR }
     * 
     */
    public SensorMFR createSensorMFR() {
        return new SensorMFR();
    }

    /**
     * Create an instance of {@link GetPOCsResponse }
     * 
     */
    public GetPOCsResponse createGetPOCsResponse() {
        return new GetPOCsResponse();
    }

    /**
     * Create an instance of {@link UpdateSensor }
     * 
     */
    public UpdateSensor createUpdateSensor() {
        return new UpdateSensor();
    }

    /**
     * Create an instance of {@link GetAllSensorMetadata }
     * 
     */
    public GetAllSensorMetadata createGetAllSensorMetadata() {
        return new GetAllSensorMetadata();
    }

    /**
     * Create an instance of {@link InsertSensorMetadataResponse }
     * 
     */
    public InsertSensorMetadataResponse createInsertSensorMetadataResponse() {
        return new InsertSensorMetadataResponse();
    }

    /**
     * Create an instance of {@link AddAssetToSensorResponse }
     * 
     */
    public AddAssetToSensorResponse createAddAssetToSensorResponse() {
        return new AddAssetToSensorResponse();
    }

    /**
     * Create an instance of {@link GetOrganizationsResponse }
     * 
     */
    public GetOrganizationsResponse createGetOrganizationsResponse() {
        return new GetOrganizationsResponse();
    }

    /**
     * Create an instance of {@link Poc }
     * 
     */
    public Poc createPoc() {
        return new Poc();
    }

    /**
     * Create an instance of {@link AddAssetToSensor }
     * 
     */
    public AddAssetToSensor createAddAssetToSensor() {
        return new AddAssetToSensor();
    }

    /**
     * Create an instance of {@link DeleteOrganizationResponse }
     * 
     */
    public DeleteOrganizationResponse createDeleteOrganizationResponse() {
        return new DeleteOrganizationResponse();
    }

    /**
     * Create an instance of {@link UpdateSensorMetadataResponse }
     * 
     */
    public UpdateSensorMetadataResponse createUpdateSensorMetadataResponse() {
        return new UpdateSensorMetadataResponse();
    }

    /**
     * Create an instance of {@link UpdatePOCResponse }
     * 
     */
    public UpdatePOCResponse createUpdatePOCResponse() {
        return new UpdatePOCResponse();
    }

    /**
     * Create an instance of {@link GetPlatformsResponse }
     * 
     */
    public GetPlatformsResponse createGetPlatformsResponse() {
        return new GetPlatformsResponse();
    }

    /**
     * Create an instance of {@link GetSensors }
     * 
     */
    public GetSensors createGetSensors() {
        return new GetSensors();
    }

    /**
     * Create an instance of {@link DeleteSpectrum }
     * 
     */
    public DeleteSpectrum createDeleteSpectrum() {
        return new DeleteSpectrum();
    }

    /**
     * Create an instance of {@link DeleteSensorMetadata }
     * 
     */
    public DeleteSensorMetadata createDeleteSensorMetadata() {
        return new DeleteSensorMetadata();
    }

    /**
     * Create an instance of {@link InsertCollectionResponse }
     * 
     */
    public InsertCollectionResponse createInsertCollectionResponse() {
        return new InsertCollectionResponse();
    }

    /**
     * Create an instance of {@link InsertAsset }
     * 
     */
    public InsertAsset createInsertAsset() {
        return new InsertAsset();
    }

    /**
     * Create an instance of {@link GetCollections }
     * 
     */
    public GetCollections createGetCollections() {
        return new GetCollections();
    }

    /**
     * Create an instance of {@link InsertSensorMFRResponse }
     * 
     */
    public InsertSensorMFRResponse createInsertSensorMFRResponse() {
        return new InsertSensorMFRResponse();
    }

    /**
     * Create an instance of {@link DeleteSensorResponse }
     * 
     */
    public DeleteSensorResponse createDeleteSensorResponse() {
        return new DeleteSensorResponse();
    }

    /**
     * Create an instance of {@link DeleteAssetResponse }
     * 
     */
    public DeleteAssetResponse createDeleteAssetResponse() {
        return new DeleteAssetResponse();
    }

    /**
     * Create an instance of {@link DeletePOCResponse }
     * 
     */
    public DeletePOCResponse createDeletePOCResponse() {
        return new DeletePOCResponse();
    }

    /**
     * Create an instance of {@link InsertSensor }
     * 
     */
    public InsertSensor createInsertSensor() {
        return new InsertSensor();
    }

    /**
     * Create an instance of {@link UpdateSpectrumResponse }
     * 
     */
    public UpdateSpectrumResponse createUpdateSpectrumResponse() {
        return new UpdateSpectrumResponse();
    }

    /**
     * Create an instance of {@link InsertSensorMetadata }
     * 
     */
    public InsertSensorMetadata createInsertSensorMetadata() {
        return new InsertSensorMetadata();
    }

    /**
     * Create an instance of {@link Platform }
     * 
     */
    public Platform createPlatform() {
        return new Platform();
    }

    /**
     * Create an instance of {@link InsertOrganizationResponse }
     * 
     */
    public InsertOrganizationResponse createInsertOrganizationResponse() {
        return new InsertOrganizationResponse();
    }

    /**
     * Create an instance of {@link GetAssets }
     * 
     */
    public GetAssets createGetAssets() {
        return new GetAssets();
    }

    /**
     * Create an instance of {@link InsertPOCResponse }
     * 
     */
    public InsertPOCResponse createInsertPOCResponse() {
        return new InsertPOCResponse();
    }

    /**
     * Create an instance of {@link GetCollectionsResponse }
     * 
     */
    public GetCollectionsResponse createGetCollectionsResponse() {
        return new GetCollectionsResponse();
    }

    /**
     * Create an instance of {@link GetSpectrums }
     * 
     */
    public GetSpectrums createGetSpectrums() {
        return new GetSpectrums();
    }

    /**
     * Create an instance of {@link Sensor }
     * 
     */
    public Sensor createSensor() {
        return new Sensor();
    }

    /**
     * Create an instance of {@link InsertAssetResponse }
     * 
     */
    public InsertAssetResponse createInsertAssetResponse() {
        return new InsertAssetResponse();
    }

    /**
     * Create an instance of {@link UpdateAssetResponse }
     * 
     */
    public UpdateAssetResponse createUpdateAssetResponse() {
        return new UpdateAssetResponse();
    }

    /**
     * Create an instance of {@link UpdateCollectionResponse }
     * 
     */
    public UpdateCollectionResponse createUpdateCollectionResponse() {
        return new UpdateCollectionResponse();
    }

    /**
     * Create an instance of {@link GetPOCs }
     * 
     */
    public GetPOCs createGetPOCs() {
        return new GetPOCs();
    }

    /**
     * Create an instance of {@link InsertSensorMFR }
     * 
     */
    public InsertSensorMFR createInsertSensorMFR() {
        return new InsertSensorMFR();
    }

    /**
     * Create an instance of {@link InsertCollection }
     * 
     */
    public InsertCollection createInsertCollection() {
        return new InsertCollection();
    }

    /**
     * Create an instance of {@link GetPlatforms }
     * 
     */
    public GetPlatforms createGetPlatforms() {
        return new GetPlatforms();
    }

    /**
     * Create an instance of {@link UpdateSensorResponse }
     * 
     */
    public UpdateSensorResponse createUpdateSensorResponse() {
        return new UpdateSensorResponse();
    }

    /**
     * Create an instance of {@link Collection }
     * 
     */
    public Collection createCollection() {
        return new Collection();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSensorMFRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertSensorMFRResponse")
    public JAXBElement<InsertSensorMFRResponse> createInsertSensorMFRResponse(InsertSensorMFRResponse value) {
        return new JAXBElement<InsertSensorMFRResponse>(_InsertSensorMFRResponse_QNAME, InsertSensorMFRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSensorMFRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateSensorMFRResponse")
    public JAXBElement<UpdateSensorMFRResponse> createUpdateSensorMFRResponse(UpdateSensorMFRResponse value) {
        return new JAXBElement<UpdateSensorMFRResponse>(_UpdateSensorMFRResponse_QNAME, UpdateSensorMFRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateCollection")
    public JAXBElement<UpdateCollection> createUpdateCollection(UpdateCollection value) {
        return new JAXBElement<UpdateCollection>(_UpdateCollection_QNAME, UpdateCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrganizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteOrganizationResponse")
    public JAXBElement<DeleteOrganizationResponse> createDeleteOrganizationResponse(DeleteOrganizationResponse value) {
        return new JAXBElement<DeleteOrganizationResponse>(_DeleteOrganizationResponse_QNAME, DeleteOrganizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpectrumsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getSpectrumsResponse")
    public JAXBElement<GetSpectrumsResponse> createGetSpectrumsResponse(GetSpectrumsResponse value) {
        return new JAXBElement<GetSpectrumsResponse>(_GetSpectrumsResponse_QNAME, GetSpectrumsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssetsForSensorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getAssetsForSensorResponse")
    public JAXBElement<GetAssetsForSensorResponse> createGetAssetsForSensorResponse(GetAssetsForSensorResponse value) {
        return new JAXBElement<GetAssetsForSensorResponse>(_GetAssetsForSensorResponse_QNAME, GetAssetsForSensorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCollections }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteCollections")
    public JAXBElement<DeleteCollections> createDeleteCollections(DeleteCollections value) {
        return new JAXBElement<DeleteCollections>(_DeleteCollections_QNAME, DeleteCollections.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSensorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateSensorResponse")
    public JAXBElement<UpdateSensorResponse> createUpdateSensorResponse(UpdateSensorResponse value) {
        return new JAXBElement<UpdateSensorResponse>(_UpdateSensorResponse_QNAME, UpdateSensorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteAsset")
    public JAXBElement<DeleteAsset> createDeleteAsset(DeleteAsset value) {
        return new JAXBElement<DeleteAsset>(_DeleteAsset_QNAME, DeleteAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssetsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getAssetsResponse")
    public JAXBElement<GetAssetsResponse> createGetAssetsResponse(GetAssetsResponse value) {
        return new JAXBElement<GetAssetsResponse>(_GetAssetsResponse_QNAME, GetAssetsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateOrganization")
    public JAXBElement<UpdateOrganization> createUpdateOrganization(UpdateOrganization value) {
        return new JAXBElement<UpdateOrganization>(_UpdateOrganization_QNAME, UpdateOrganization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSpectrumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteSpectrumResponse")
    public JAXBElement<DeleteSpectrumResponse> createDeleteSpectrumResponse(DeleteSpectrumResponse value) {
        return new JAXBElement<DeleteSpectrumResponse>(_DeleteSpectrumResponse_QNAME, DeleteSpectrumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAssetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertAssetResponse")
    public JAXBElement<InsertAssetResponse> createInsertAssetResponse(InsertAssetResponse value) {
        return new JAXBElement<InsertAssetResponse>(_InsertAssetResponse_QNAME, InsertAssetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteCollectionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteCollectionsResponse")
    public JAXBElement<DeleteCollectionsResponse> createDeleteCollectionsResponse(DeleteCollectionsResponse value) {
        return new JAXBElement<DeleteCollectionsResponse>(_DeleteCollectionsResponse_QNAME, DeleteCollectionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollections }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getCollections")
    public JAXBElement<GetCollections> createGetCollections(GetCollections value) {
        return new JAXBElement<GetCollections>(_GetCollections_QNAME, GetCollections.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlatformsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getPlatformsResponse")
    public JAXBElement<GetPlatformsResponse> createGetPlatformsResponse(GetPlatformsResponse value) {
        return new JAXBElement<GetPlatformsResponse>(_GetPlatformsResponse_QNAME, GetPlatformsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePOC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deletePOC")
    public JAXBElement<DeletePOC> createDeletePOC(DeletePOC value) {
        return new JAXBElement<DeletePOC>(_DeletePOC_QNAME, DeletePOC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCollection }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertCollection")
    public JAXBElement<InsertCollection> createInsertCollection(InsertCollection value) {
        return new JAXBElement<InsertCollection>(_InsertCollection_QNAME, InsertCollection.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSensorMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteSensorMetadata")
    public JAXBElement<DeleteSensorMetadata> createDeleteSensorMetadata(DeleteSensorMetadata value) {
        return new JAXBElement<DeleteSensorMetadata>(_DeleteSensorMetadata_QNAME, DeleteSensorMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSensorsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getSensorsResponse")
    public JAXBElement<GetSensorsResponse> createGetSensorsResponse(GetSensorsResponse value) {
        return new JAXBElement<GetSensorsResponse>(_GetSensorsResponse_QNAME, GetSensorsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSensorMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertSensorMetadataResponse")
    public JAXBElement<InsertSensorMetadataResponse> createInsertSensorMetadataResponse(InsertSensorMetadataResponse value) {
        return new JAXBElement<InsertSensorMetadataResponse>(_InsertSensorMetadataResponse_QNAME, InsertSensorMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSensorMFR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteSensorMFR")
    public JAXBElement<DeleteSensorMFR> createDeleteSensorMFR(DeleteSensorMFR value) {
        return new JAXBElement<DeleteSensorMFR>(_DeleteSensorMFR_QNAME, DeleteSensorMFR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSensorToAssetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "addSensorToAssetResponse")
    public JAXBElement<AddSensorToAssetResponse> createAddSensorToAssetResponse(AddSensorToAssetResponse value) {
        return new JAXBElement<AddSensorToAssetResponse>(_AddSensorToAssetResponse_QNAME, AddSensorToAssetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSensorMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertSensorMetadata")
    public JAXBElement<InsertSensorMetadata> createInsertSensorMetadata(InsertSensorMetadata value) {
        return new JAXBElement<InsertSensorMetadata>(_InsertSensorMetadata_QNAME, InsertSensorMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPOCs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getPOCs")
    public JAXBElement<GetPOCs> createGetPOCs(GetPOCs value) {
        return new JAXBElement<GetPOCs>(_GetPOCs_QNAME, GetPOCs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPlatform }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertPlatform")
    public JAXBElement<InsertPlatform> createInsertPlatform(InsertPlatform value) {
        return new JAXBElement<InsertPlatform>(_InsertPlatform_QNAME, InsertPlatform.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePlatformResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deletePlatformResponse")
    public JAXBElement<DeletePlatformResponse> createDeletePlatformResponse(DeletePlatformResponse value) {
        return new JAXBElement<DeletePlatformResponse>(_DeletePlatformResponse_QNAME, DeletePlatformResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPlatformResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertPlatformResponse")
    public JAXBElement<InsertPlatformResponse> createInsertPlatformResponse(InsertPlatformResponse value) {
        return new JAXBElement<InsertPlatformResponse>(_InsertPlatformResponse_QNAME, InsertPlatformResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSensor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteSensor")
    public JAXBElement<DeleteSensor> createDeleteSensor(DeleteSensor value) {
        return new JAXBElement<DeleteSensor>(_DeleteSensor_QNAME, DeleteSensor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteOrganization")
    public JAXBElement<DeleteOrganization> createDeleteOrganization(DeleteOrganization value) {
        return new JAXBElement<DeleteOrganization>(_DeleteOrganization_QNAME, DeleteOrganization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePlatform }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updatePlatform")
    public JAXBElement<UpdatePlatform> createUpdatePlatform(UpdatePlatform value) {
        return new JAXBElement<UpdatePlatform>(_UpdatePlatform_QNAME, UpdatePlatform.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAssetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateAssetResponse")
    public JAXBElement<UpdateAssetResponse> createUpdateAssetResponse(UpdateAssetResponse value) {
        return new JAXBElement<UpdateAssetResponse>(_UpdateAssetResponse_QNAME, UpdateAssetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSensorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteSensorResponse")
    public JAXBElement<DeleteSensorResponse> createDeleteSensorResponse(DeleteSensorResponse value) {
        return new JAXBElement<DeleteSensorResponse>(_DeleteSensorResponse_QNAME, DeleteSensorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOrganizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertOrganizationResponse")
    public JAXBElement<InsertOrganizationResponse> createInsertOrganizationResponse(InsertOrganizationResponse value) {
        return new JAXBElement<InsertOrganizationResponse>(_InsertOrganizationResponse_QNAME, InsertOrganizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSpectrum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateSpectrum")
    public JAXBElement<UpdateSpectrum> createUpdateSpectrum(UpdateSpectrum value) {
        return new JAXBElement<UpdateSpectrum>(_UpdateSpectrum_QNAME, UpdateSpectrum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPOCsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getPOCsResponse")
    public JAXBElement<GetPOCsResponse> createGetPOCsResponse(GetPOCsResponse value) {
        return new JAXBElement<GetPOCsResponse>(_GetPOCsResponse_QNAME, GetPOCsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePlatform }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deletePlatform")
    public JAXBElement<DeletePlatform> createDeletePlatform(DeletePlatform value) {
        return new JAXBElement<DeletePlatform>(_DeletePlatform_QNAME, DeletePlatform.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSpectrum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertSpectrum")
    public JAXBElement<InsertSpectrum> createInsertSpectrum(InsertSpectrum value) {
        return new JAXBElement<InsertSpectrum>(_InsertSpectrum_QNAME, InsertSpectrum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPOC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertPOC")
    public JAXBElement<InsertPOC> createInsertPOC(InsertPOC value) {
        return new JAXBElement<InsertPOC>(_InsertPOC_QNAME, InsertPOC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePOCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updatePOCResponse")
    public JAXBElement<UpdatePOCResponse> createUpdatePOCResponse(UpdatePOCResponse value) {
        return new JAXBElement<UpdatePOCResponse>(_UpdatePOCResponse_QNAME, UpdatePOCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSpectrum }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteSpectrum")
    public JAXBElement<DeleteSpectrum> createDeleteSpectrum(DeleteSpectrum value) {
        return new JAXBElement<DeleteSpectrum>(_DeleteSpectrum_QNAME, DeleteSpectrum.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSensorMFR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertSensorMFR")
    public JAXBElement<InsertSensorMFR> createInsertSensorMFR(InsertSensorMFR value) {
        return new JAXBElement<InsertSensorMFR>(_InsertSensorMFR_QNAME, InsertSensorMFR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSensorMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateSensorMetadata")
    public JAXBElement<UpdateSensorMetadata> createUpdateSensorMetadata(UpdateSensorMetadata value) {
        return new JAXBElement<UpdateSensorMetadata>(_UpdateSensorMetadata_QNAME, UpdateSensorMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertAsset")
    public JAXBElement<InsertAsset> createInsertAsset(InsertAsset value) {
        return new JAXBElement<InsertAsset>(_InsertAsset_QNAME, InsertAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSensor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertSensor")
    public JAXBElement<InsertSensor> createInsertSensor(InsertSensor value) {
        return new JAXBElement<InsertSensor>(_InsertSensor_QNAME, InsertSensor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSensor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateSensor")
    public JAXBElement<UpdateSensor> createUpdateSensor(UpdateSensor value) {
        return new JAXBElement<UpdateSensor>(_UpdateSensor_QNAME, UpdateSensor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSpectrums }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getSpectrums")
    public JAXBElement<GetSpectrums> createGetSpectrums(GetSpectrums value) {
        return new JAXBElement<GetSpectrums>(_GetSpectrums_QNAME, GetSpectrums.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizationsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getOrganizationsResponse")
    public JAXBElement<GetOrganizationsResponse> createGetOrganizationsResponse(GetOrganizationsResponse value) {
        return new JAXBElement<GetOrganizationsResponse>(_GetOrganizationsResponse_QNAME, GetOrganizationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertOrganization }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertOrganization")
    public JAXBElement<InsertOrganization> createInsertOrganization(InsertOrganization value) {
        return new JAXBElement<InsertOrganization>(_InsertOrganization_QNAME, InsertOrganization.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateAsset")
    public JAXBElement<UpdateAsset> createUpdateAsset(UpdateAsset value) {
        return new JAXBElement<UpdateAsset>(_UpdateAsset_QNAME, UpdateAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateOrganizationResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateOrganizationResponse")
    public JAXBElement<UpdateOrganizationResponse> createUpdateOrganizationResponse(UpdateOrganizationResponse value) {
        return new JAXBElement<UpdateOrganizationResponse>(_UpdateOrganizationResponse_QNAME, UpdateOrganizationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSensorMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteSensorMetadataResponse")
    public JAXBElement<DeleteSensorMetadataResponse> createDeleteSensorMetadataResponse(DeleteSensorMetadataResponse value) {
        return new JAXBElement<DeleteSensorMetadataResponse>(_DeleteSensorMetadataResponse_QNAME, DeleteSensorMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteSensorMFRResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteSensorMFRResponse")
    public JAXBElement<DeleteSensorMFRResponse> createDeleteSensorMFRResponse(DeleteSensorMFRResponse value) {
        return new JAXBElement<DeleteSensorMFRResponse>(_DeleteSensorMFRResponse_QNAME, DeleteSensorMFRResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePlatformResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updatePlatformResponse")
    public JAXBElement<UpdatePlatformResponse> createUpdatePlatformResponse(UpdatePlatformResponse value) {
        return new JAXBElement<UpdatePlatformResponse>(_UpdatePlatformResponse_QNAME, UpdatePlatformResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSensorMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getAllSensorMetadataResponse")
    public JAXBElement<GetAllSensorMetadataResponse> createGetAllSensorMetadataResponse(GetAllSensorMetadataResponse value) {
        return new JAXBElement<GetAllSensorMetadataResponse>(_GetAllSensorMetadataResponse_QNAME, GetAllSensorMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPlatforms }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getPlatforms")
    public JAXBElement<GetPlatforms> createGetPlatforms(GetPlatforms value) {
        return new JAXBElement<GetPlatforms>(_GetPlatforms_QNAME, GetPlatforms.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeletePOCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deletePOCResponse")
    public JAXBElement<DeletePOCResponse> createDeletePOCResponse(DeletePOCResponse value) {
        return new JAXBElement<DeletePOCResponse>(_DeletePOCResponse_QNAME, DeletePOCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllSensorMetadata }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getAllSensorMetadata")
    public JAXBElement<GetAllSensorMetadata> createGetAllSensorMetadata(GetAllSensorMetadata value) {
        return new JAXBElement<GetAllSensorMetadata>(_GetAllSensorMetadata_QNAME, GetAllSensorMetadata.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertCollectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertCollectionResponse")
    public JAXBElement<InsertCollectionResponse> createInsertCollectionResponse(InsertCollectionResponse value) {
        return new JAXBElement<InsertCollectionResponse>(_InsertCollectionResponse_QNAME, InsertCollectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssetsForSensor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getAssetsForSensor")
    public JAXBElement<GetAssetsForSensor> createGetAssetsForSensor(GetAssetsForSensor value) {
        return new JAXBElement<GetAssetsForSensor>(_GetAssetsForSensor_QNAME, GetAssetsForSensor.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateCollectionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateCollectionResponse")
    public JAXBElement<UpdateCollectionResponse> createUpdateCollectionResponse(UpdateCollectionResponse value) {
        return new JAXBElement<UpdateCollectionResponse>(_UpdateCollectionResponse_QNAME, UpdateCollectionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSensors }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getSensors")
    public JAXBElement<GetSensors> createGetSensors(GetSensors value) {
        return new JAXBElement<GetSensors>(_GetSensors_QNAME, GetSensors.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSpectrumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertSpectrumResponse")
    public JAXBElement<InsertSpectrumResponse> createInsertSpectrumResponse(InsertSpectrumResponse value) {
        return new JAXBElement<InsertSpectrumResponse>(_InsertSpectrumResponse_QNAME, InsertSpectrumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddSensorToAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "addSensorToAsset")
    public JAXBElement<AddSensorToAsset> createAddSensorToAsset(AddSensorToAsset value) {
        return new JAXBElement<AddSensorToAsset>(_AddSensorToAsset_QNAME, AddSensorToAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAssetToSensorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "addAssetToSensorResponse")
    public JAXBElement<AddAssetToSensorResponse> createAddAssetToSensorResponse(AddAssetToSensorResponse value) {
        return new JAXBElement<AddAssetToSensorResponse>(_AddAssetToSensorResponse_QNAME, AddAssetToSensorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteAssetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "deleteAssetResponse")
    public JAXBElement<DeleteAssetResponse> createDeleteAssetResponse(DeleteAssetResponse value) {
        return new JAXBElement<DeleteAssetResponse>(_DeleteAssetResponse_QNAME, DeleteAssetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSensorsForAsset }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getSensorsForAsset")
    public JAXBElement<GetSensorsForAsset> createGetSensorsForAsset(GetSensorsForAsset value) {
        return new JAXBElement<GetSensorsForAsset>(_GetSensorsForAsset_QNAME, GetSensorsForAsset.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSensorMFR }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateSensorMFR")
    public JAXBElement<UpdateSensorMFR> createUpdateSensorMFR(UpdateSensorMFR value) {
        return new JAXBElement<UpdateSensorMFR>(_UpdateSensorMFR_QNAME, UpdateSensorMFR.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAssets }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getAssets")
    public JAXBElement<GetAssets> createGetAssets(GetAssets value) {
        return new JAXBElement<GetAssets>(_GetAssets_QNAME, GetAssets.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSpectrumResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateSpectrumResponse")
    public JAXBElement<UpdateSpectrumResponse> createUpdateSpectrumResponse(UpdateSpectrumResponse value) {
        return new JAXBElement<UpdateSpectrumResponse>(_UpdateSpectrumResponse_QNAME, UpdateSpectrumResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCollectionsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getCollectionsResponse")
    public JAXBElement<GetCollectionsResponse> createGetCollectionsResponse(GetCollectionsResponse value) {
        return new JAXBElement<GetCollectionsResponse>(_GetCollectionsResponse_QNAME, GetCollectionsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSensorsForAssetResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getSensorsForAssetResponse")
    public JAXBElement<GetSensorsForAssetResponse> createGetSensorsForAssetResponse(GetSensorsForAssetResponse value) {
        return new JAXBElement<GetSensorsForAssetResponse>(_GetSensorsForAssetResponse_QNAME, GetSensorsForAssetResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrganizations }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getOrganizations")
    public JAXBElement<GetOrganizations> createGetOrganizations(GetOrganizations value) {
        return new JAXBElement<GetOrganizations>(_GetOrganizations_QNAME, GetOrganizations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSensorMFRs }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getSensorMFRs")
    public JAXBElement<GetSensorMFRs> createGetSensorMFRs(GetSensorMFRs value) {
        return new JAXBElement<GetSensorMFRs>(_GetSensorMFRs_QNAME, GetSensorMFRs.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertSensorResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertSensorResponse")
    public JAXBElement<InsertSensorResponse> createInsertSensorResponse(InsertSensorResponse value) {
        return new JAXBElement<InsertSensorResponse>(_InsertSensorResponse_QNAME, InsertSensorResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdatePOC }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updatePOC")
    public JAXBElement<UpdatePOC> createUpdatePOC(UpdatePOC value) {
        return new JAXBElement<UpdatePOC>(_UpdatePOC_QNAME, UpdatePOC.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSensorMFRsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "getSensorMFRsResponse")
    public JAXBElement<GetSensorMFRsResponse> createGetSensorMFRsResponse(GetSensorMFRsResponse value) {
        return new JAXBElement<GetSensorMFRsResponse>(_GetSensorMFRsResponse_QNAME, GetSensorMFRsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertPOCResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "insertPOCResponse")
    public JAXBElement<InsertPOCResponse> createInsertPOCResponse(InsertPOCResponse value) {
        return new JAXBElement<InsertPOCResponse>(_InsertPOCResponse_QNAME, InsertPOCResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSensorMetadataResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "updateSensorMetadataResponse")
    public JAXBElement<UpdateSensorMetadataResponse> createUpdateSensorMetadataResponse(UpdateSensorMetadataResponse value) {
        return new JAXBElement<UpdateSensorMetadataResponse>(_UpdateSensorMetadataResponse_QNAME, UpdateSensorMetadataResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddAssetToSensor }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://webservices.safe.woolpert.com/", name = "addAssetToSensor")
    public JAXBElement<AddAssetToSensor> createAddAssetToSensor(AddAssetToSensor value) {
        return new JAXBElement<AddAssetToSensor>(_AddAssetToSensor_QNAME, AddAssetToSensor.class, null, value);
    }

}
