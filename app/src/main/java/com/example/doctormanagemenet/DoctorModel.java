
package com.example.doctormanagemenet;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;


class Department {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("tenant_id")
    @Expose
    private String tenantId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

}

public class DoctorModel {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("user_id")
    @Expose
    private Integer userId;
    @SerializedName("doctor_department_id")
    @Expose
    private Integer doctorDepartmentId;
    @SerializedName("specialist")
    @Expose
    private String specialist;
    @SerializedName("fee")
    @Expose
    private String fee;
    @SerializedName("experience")
    @Expose
    private Object experience;
    @SerializedName("bmdc")
    @Expose
    private Object bmdc;
    @SerializedName("tenant_id")
    @Expose
    private String tenantId;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("department")
    @Expose
    private Department department;
    @SerializedName("user")
    @Expose
    private User user;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getDoctorDepartmentId() {
        return doctorDepartmentId;
    }

    public void setDoctorDepartmentId(Integer doctorDepartmentId) {
        this.doctorDepartmentId = doctorDepartmentId;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getFee() {
        return fee;
    }

    public void setFee(String fee) {
        this.fee = fee;
    }

    public Object getExperience() {
        return experience;
    }

    public void setExperience(Object experience) {
        this.experience = experience;
    }

    public Object getBmdc() {
        return bmdc;
    }

    public void setBmdc(Object bmdc) {
        this.bmdc = bmdc;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}

class Medium {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("model_type")
    @Expose
    private String modelType;
    @SerializedName("model_id")
    @Expose
    private String modelId;
    @SerializedName("collection_name")
    @Expose
    private String collectionName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("file_name")
    @Expose
    private String fileName;
    @SerializedName("mime_type")
    @Expose
    private String mimeType;
    @SerializedName("disk")
    @Expose
    private String disk;
    @SerializedName("size")
    @Expose
    private String size;
    @SerializedName("manipulations")
    @Expose
    private List<Object> manipulations = null;
    @SerializedName("custom_properties")
    @Expose
    private List<Object> customProperties = null;
    @SerializedName("responsive_images")
    @Expose
    private List<Object> responsiveImages = null;
    @SerializedName("order_column")
    @Expose
    private String orderColumn;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("conversions_disk")
    @Expose
    private String conversionsDisk;
    @SerializedName("uuid")
    @Expose
    private String uuid;
    @SerializedName("generated_conversions")
    @Expose
    private List<Object> generatedConversions = null;
    @SerializedName("original_url")
    @Expose
    private String originalUrl;
    @SerializedName("preview_url")
    @Expose
    private String previewUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getModelType() {
        return modelType;
    }

    public void setModelType(String modelType) {
        this.modelType = modelType;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getCollectionName() {
        return collectionName;
    }

    public void setCollectionName(String collectionName) {
        this.collectionName = collectionName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMimeType() {
        return mimeType;
    }

    public void setMimeType(String mimeType) {
        this.mimeType = mimeType;
    }

    public String getDisk() {
        return disk;
    }

    public void setDisk(String disk) {
        this.disk = disk;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public List<Object> getManipulations() {
        return manipulations;
    }

    public void setManipulations(List<Object> manipulations) {
        this.manipulations = manipulations;
    }

    public List<Object> getCustomProperties() {
        return customProperties;
    }

    public void setCustomProperties(List<Object> customProperties) {
        this.customProperties = customProperties;
    }

    public List<Object> getResponsiveImages() {
        return responsiveImages;
    }

    public void setResponsiveImages(List<Object> responsiveImages) {
        this.responsiveImages = responsiveImages;
    }

    public String getOrderColumn() {
        return orderColumn;
    }

    public void setOrderColumn(String orderColumn) {
        this.orderColumn = orderColumn;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getConversionsDisk() {
        return conversionsDisk;
    }

    public void setConversionsDisk(String conversionsDisk) {
        this.conversionsDisk = conversionsDisk;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public List<Object> getGeneratedConversions() {
        return generatedConversions;
    }

    public void setGeneratedConversions(List<Object> generatedConversions) {
        this.generatedConversions = generatedConversions;
    }

    public String getOriginalUrl() {
        return originalUrl;
    }

    public void setOriginalUrl(String originalUrl) {
        this.originalUrl = originalUrl;
    }

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }

}



class User {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("agent_id")
    @Expose
    private Object agentId;
    @SerializedName("department_id")
    @Expose
    private String departmentId;
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("balance")
    @Expose
    private String balance;
    @SerializedName("designation")
    @Expose
    private String designation;
    @SerializedName("phone")
    @Expose
    private String phone;
    @SerializedName("address")
    @Expose
    private Object address;
    @SerializedName("commission")
    @Expose
    private Object commission;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("qualification")
    @Expose
    private String qualification;
    @SerializedName("blood_group")
    @Expose
    private Object bloodGroup;
    @SerializedName("dob")
    @Expose
    private String dob;
    @SerializedName("email_verified_at")
    @Expose
    private Object emailVerifiedAt;
    @SerializedName("owner_id")
    @Expose
    private String ownerId;
    @SerializedName("owner_type")
    @Expose
    private String ownerType;
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("language")
    @Expose
    private String language;
    @SerializedName("username")
    @Expose
    private Object username;
    @SerializedName("hospital_name")
    @Expose
    private String hospitalName;
    @SerializedName("tenant_id")
    @Expose
    private String tenantId;
    @SerializedName("tenant_type")
    @Expose
    private String tenantType;
    @SerializedName("facebook_url")
    @Expose
    private Object facebookUrl;
    @SerializedName("twitter_url")
    @Expose
    private Object twitterUrl;
    @SerializedName("instagram_url")
    @Expose
    private Object instagramUrl;
    @SerializedName("linkedIn_url")
    @Expose
    private Object linkedInUrl;
    @SerializedName("division")
    @Expose
    private Object division;
    @SerializedName("district")
    @Expose
    private Object district;
    @SerializedName("thana")
    @Expose
    private Object thana;
    @SerializedName("village")
    @Expose
    private Object village;
    @SerializedName("disease")
    @Expose
    private Object disease;
    @SerializedName("discount")
    @Expose
    private String discount;
    @SerializedName("disease_details")
    @Expose
    private Object diseaseDetails;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("updated_at")
    @Expose
    private String updatedAt;
    @SerializedName("full_name")
    @Expose
    private String fullName;
    @SerializedName("age")
    @Expose
    private Integer age;
    @SerializedName("media")
    @Expose
    private String  media ;

    public void setMedia(String media) {
        this.media = media;
    }

    public String getMedia() {
        return media;
    }
/*@SerializedName("media")
    @Expose
    private List<Medium> media = null;
    */


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Object getAgentId() {
        return agentId;
    }

    public void setAgentId(Object agentId) {
        this.agentId = agentId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Object getAddress() {
        return address;
    }

    public void setAddress(Object address) {
        this.address = address;
    }

    public Object getCommission() {
        return commission;
    }

    public void setCommission(Object commission) {
        this.commission = commission;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public Object getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(Object bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public Object getEmailVerifiedAt() {
        return emailVerifiedAt;
    }

    public void setEmailVerifiedAt(Object emailVerifiedAt) {
        this.emailVerifiedAt = emailVerifiedAt;
    }

    public String getOwnerId() {
        return ownerId;
    }

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    public String getOwnerType() {
        return ownerType;
    }

    public void setOwnerType(String ownerType) {
        this.ownerType = ownerType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Object getUsername() {
        return username;
    }

    public void setUsername(Object username) {
        this.username = username;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void setHospitalName(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getTenantType() {
        return tenantType;
    }

    public void setTenantType(String tenantType) {
        this.tenantType = tenantType;
    }

    public Object getFacebookUrl() {
        return facebookUrl;
    }

    public void setFacebookUrl(Object facebookUrl) {
        this.facebookUrl = facebookUrl;
    }

    public Object getTwitterUrl() {
        return twitterUrl;
    }

    public void setTwitterUrl(Object twitterUrl) {
        this.twitterUrl = twitterUrl;
    }

    public Object getInstagramUrl() {
        return instagramUrl;
    }

    public void setInstagramUrl(Object instagramUrl) {
        this.instagramUrl = instagramUrl;
    }

    public Object getLinkedInUrl() {
        return linkedInUrl;
    }

    public void setLinkedInUrl(Object linkedInUrl) {
        this.linkedInUrl = linkedInUrl;
    }

    public Object getDivision() {
        return division;
    }

    public void setDivision(Object division) {
        this.division = division;
    }

    public Object getDistrict() {
        return district;
    }

    public void setDistrict(Object district) {
        this.district = district;
    }

    public Object getThana() {
        return thana;
    }

    public void setThana(Object thana) {
        this.thana = thana;
    }

    public Object getVillage() {
        return village;
    }

    public void setVillage(Object village) {
        this.village = village;
    }

    public Object getDisease() {
        return disease;
    }

    public void setDisease(Object disease) {
        this.disease = disease;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public Object getDiseaseDetails() {
        return diseaseDetails;
    }

    public void setDiseaseDetails(Object diseaseDetails) {
        this.diseaseDetails = diseaseDetails;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    /*public List<Medium> getMedia() {
        return media;
    }

    public void setMedia(List<Medium> media) {
        this.media = media;
    }*/

}