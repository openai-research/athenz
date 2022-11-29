//
// This file generated by rdl 1.5.2. Do not modify!
//

package com.yahoo.athenz.zms;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import java.util.Map;
import com.yahoo.rdl.*;

//
// Domain - A domain is an independent partition of users, roles, and
// resources. Its name represents the definition of a namespace; the only way a
// new namespace can be created, from the top, is by creating Domains.
// Administration of a domain is governed by the parent domain (using
// reverse-DNS namespaces). The top level domains are governed by the special
// "sys.auth" domain.
//
@JsonIgnoreProperties(ignoreUnknown = true)
public class Domain {
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String description;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String org;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean enabled;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Boolean auditEnabled;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String account;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer ypmId;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String applicationId;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String certDnsDomain;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer memberExpiryDays;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer tokenExpiryMins;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer serviceCertExpiryMins;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer roleCertExpiryMins;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String signAlgorithm;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer serviceExpiryDays;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer groupExpiryDays;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String userAuthorityFilter;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String azureSubscription;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public String gcpProject;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Map<String, TagValueList> tags;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_NULL)
    public String businessService;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Integer memberPurgeExpiryDays;
    public String name;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public Timestamp modified;
    @RdlOptional
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    public UUID id;

    public Domain setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return description;
    }
    public Domain setOrg(String org) {
        this.org = org;
        return this;
    }
    public String getOrg() {
        return org;
    }
    public Domain setEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }
    public Boolean getEnabled() {
        return enabled;
    }
    public Domain setAuditEnabled(Boolean auditEnabled) {
        this.auditEnabled = auditEnabled;
        return this;
    }
    public Boolean getAuditEnabled() {
        return auditEnabled;
    }
    public Domain setAccount(String account) {
        this.account = account;
        return this;
    }
    public String getAccount() {
        return account;
    }
    public Domain setYpmId(Integer ypmId) {
        this.ypmId = ypmId;
        return this;
    }
    public Integer getYpmId() {
        return ypmId;
    }
    public Domain setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return applicationId;
    }
    public Domain setCertDnsDomain(String certDnsDomain) {
        this.certDnsDomain = certDnsDomain;
        return this;
    }
    public String getCertDnsDomain() {
        return certDnsDomain;
    }
    public Domain setMemberExpiryDays(Integer memberExpiryDays) {
        this.memberExpiryDays = memberExpiryDays;
        return this;
    }
    public Integer getMemberExpiryDays() {
        return memberExpiryDays;
    }
    public Domain setTokenExpiryMins(Integer tokenExpiryMins) {
        this.tokenExpiryMins = tokenExpiryMins;
        return this;
    }
    public Integer getTokenExpiryMins() {
        return tokenExpiryMins;
    }
    public Domain setServiceCertExpiryMins(Integer serviceCertExpiryMins) {
        this.serviceCertExpiryMins = serviceCertExpiryMins;
        return this;
    }
    public Integer getServiceCertExpiryMins() {
        return serviceCertExpiryMins;
    }
    public Domain setRoleCertExpiryMins(Integer roleCertExpiryMins) {
        this.roleCertExpiryMins = roleCertExpiryMins;
        return this;
    }
    public Integer getRoleCertExpiryMins() {
        return roleCertExpiryMins;
    }
    public Domain setSignAlgorithm(String signAlgorithm) {
        this.signAlgorithm = signAlgorithm;
        return this;
    }
    public String getSignAlgorithm() {
        return signAlgorithm;
    }
    public Domain setServiceExpiryDays(Integer serviceExpiryDays) {
        this.serviceExpiryDays = serviceExpiryDays;
        return this;
    }
    public Integer getServiceExpiryDays() {
        return serviceExpiryDays;
    }
    public Domain setGroupExpiryDays(Integer groupExpiryDays) {
        this.groupExpiryDays = groupExpiryDays;
        return this;
    }
    public Integer getGroupExpiryDays() {
        return groupExpiryDays;
    }
    public Domain setUserAuthorityFilter(String userAuthorityFilter) {
        this.userAuthorityFilter = userAuthorityFilter;
        return this;
    }
    public String getUserAuthorityFilter() {
        return userAuthorityFilter;
    }
    public Domain setAzureSubscription(String azureSubscription) {
        this.azureSubscription = azureSubscription;
        return this;
    }
    public String getAzureSubscription() {
        return azureSubscription;
    }
    public Domain setGcpProject(String gcpProject) {
        this.gcpProject = gcpProject;
        return this;
    }
    public String getGcpProject() {
        return gcpProject;
    }
    public Domain setTags(Map<String, TagValueList> tags) {
        this.tags = tags;
        return this;
    }
    public Map<String, TagValueList> getTags() {
        return tags;
    }
    public Domain setBusinessService(String businessService) {
        this.businessService = businessService;
        return this;
    }
    public String getBusinessService() {
        return businessService;
    }
    public Domain setMemberPurgeExpiryDays(Integer memberPurgeExpiryDays) {
        this.memberPurgeExpiryDays = memberPurgeExpiryDays;
        return this;
    }
    public Integer getMemberPurgeExpiryDays() {
        return memberPurgeExpiryDays;
    }
    public Domain setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return name;
    }
    public Domain setModified(Timestamp modified) {
        this.modified = modified;
        return this;
    }
    public Timestamp getModified() {
        return modified;
    }
    public Domain setId(UUID id) {
        this.id = id;
        return this;
    }
    public UUID getId() {
        return id;
    }

    @Override
    public boolean equals(Object another) {
        if (this != another) {
            if (another == null || another.getClass() != Domain.class) {
                return false;
            }
            Domain a = (Domain) another;
            if (description == null ? a.description != null : !description.equals(a.description)) {
                return false;
            }
            if (org == null ? a.org != null : !org.equals(a.org)) {
                return false;
            }
            if (enabled == null ? a.enabled != null : !enabled.equals(a.enabled)) {
                return false;
            }
            if (auditEnabled == null ? a.auditEnabled != null : !auditEnabled.equals(a.auditEnabled)) {
                return false;
            }
            if (account == null ? a.account != null : !account.equals(a.account)) {
                return false;
            }
            if (ypmId == null ? a.ypmId != null : !ypmId.equals(a.ypmId)) {
                return false;
            }
            if (applicationId == null ? a.applicationId != null : !applicationId.equals(a.applicationId)) {
                return false;
            }
            if (certDnsDomain == null ? a.certDnsDomain != null : !certDnsDomain.equals(a.certDnsDomain)) {
                return false;
            }
            if (memberExpiryDays == null ? a.memberExpiryDays != null : !memberExpiryDays.equals(a.memberExpiryDays)) {
                return false;
            }
            if (tokenExpiryMins == null ? a.tokenExpiryMins != null : !tokenExpiryMins.equals(a.tokenExpiryMins)) {
                return false;
            }
            if (serviceCertExpiryMins == null ? a.serviceCertExpiryMins != null : !serviceCertExpiryMins.equals(a.serviceCertExpiryMins)) {
                return false;
            }
            if (roleCertExpiryMins == null ? a.roleCertExpiryMins != null : !roleCertExpiryMins.equals(a.roleCertExpiryMins)) {
                return false;
            }
            if (signAlgorithm == null ? a.signAlgorithm != null : !signAlgorithm.equals(a.signAlgorithm)) {
                return false;
            }
            if (serviceExpiryDays == null ? a.serviceExpiryDays != null : !serviceExpiryDays.equals(a.serviceExpiryDays)) {
                return false;
            }
            if (groupExpiryDays == null ? a.groupExpiryDays != null : !groupExpiryDays.equals(a.groupExpiryDays)) {
                return false;
            }
            if (userAuthorityFilter == null ? a.userAuthorityFilter != null : !userAuthorityFilter.equals(a.userAuthorityFilter)) {
                return false;
            }
            if (azureSubscription == null ? a.azureSubscription != null : !azureSubscription.equals(a.azureSubscription)) {
                return false;
            }
            if (gcpProject == null ? a.gcpProject != null : !gcpProject.equals(a.gcpProject)) {
                return false;
            }
            if (tags == null ? a.tags != null : !tags.equals(a.tags)) {
                return false;
            }
            if (businessService == null ? a.businessService != null : !businessService.equals(a.businessService)) {
                return false;
            }
            if (memberPurgeExpiryDays == null ? a.memberPurgeExpiryDays != null : !memberPurgeExpiryDays.equals(a.memberPurgeExpiryDays)) {
                return false;
            }
            if (name == null ? a.name != null : !name.equals(a.name)) {
                return false;
            }
            if (modified == null ? a.modified != null : !modified.equals(a.modified)) {
                return false;
            }
            if (id == null ? a.id != null : !id.equals(a.id)) {
                return false;
            }
        }
        return true;
    }
}
