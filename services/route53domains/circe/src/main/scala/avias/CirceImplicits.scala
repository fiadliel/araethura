package avias.route53domains
import cats.implicits._
import io.circe._
import io.circe.syntax._
object circe extends avias.common.DefaultCodecs {
  final implicit val BillingRecordEncoder: io.circe.Encoder[avias.route53domains.models.BillingRecord] = io.circe.Encoder.instance { o => 
    Json.obj("BillDate" -> o.billDate.asJson, "Price" -> o.price.asJson, "Operation" -> o.operation.asJson, "DomainName" -> o.domainName.asJson, "InvoiceId" -> o.invoiceId.asJson)
  }
  final implicit val ExtraParamEncoder: io.circe.Encoder[avias.route53domains.models.ExtraParam] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ViewBillingResponseEncoder: io.circe.Encoder[avias.route53domains.models.ViewBillingResponse] = io.circe.Encoder.instance { o => 
    Json.obj("NextPageMarker" -> o.nextPageMarker.asJson, "BillingRecords" -> o.billingRecords.asJson)
  }
  final implicit val RenewDomainRequestEncoder: io.circe.Encoder[avias.route53domains.models.RenewDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "CurrentExpiryYear" -> o.currentExpiryYear.asJson, "DurationInYears" -> o.durationInYears.asJson)
  }
  final implicit val UnsupportedTLDEncoder: io.circe.Encoder[avias.route53domains.models.UnsupportedTLD] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val TransferDomainResponseEncoder: io.circe.Encoder[avias.route53domains.models.TransferDomainResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val GetContactReachabilityStatusRequestEncoder: io.circe.Encoder[avias.route53domains.models.GetContactReachabilityStatusRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson)
  }
  final implicit val NameserverEncoder: io.circe.Encoder[avias.route53domains.models.Nameserver] = io.circe.Encoder.instance { o => 
    Json.obj("Name" -> o.name.asJson, "GlueIps" -> o.glueIps.asJson)
  }
  final implicit val ListDomainsRequestEncoder: io.circe.Encoder[avias.route53domains.models.ListDomainsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "MaxItems" -> o.maxItems.asJson)
  }
  final implicit val DeleteTagsForDomainRequestEncoder: io.circe.Encoder[avias.route53domains.models.DeleteTagsForDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "TagsToDelete" -> o.tagsToDelete.asJson)
  }
  final implicit val DomainSuggestionEncoder: io.circe.Encoder[avias.route53domains.models.DomainSuggestion] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "Availability" -> o.availability.asJson)
  }
  final implicit val ListOperationsRequestEncoder: io.circe.Encoder[avias.route53domains.models.ListOperationsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Marker" -> o.marker.asJson, "MaxItems" -> o.maxItems.asJson)
  }
  final implicit val ResendContactReachabilityEmailRequestEncoder: io.circe.Encoder[avias.route53domains.models.ResendContactReachabilityEmailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson)
  }
  final implicit val CheckDomainAvailabilityRequestEncoder: io.circe.Encoder[avias.route53domains.models.CheckDomainAvailabilityRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "IdnLangCode" -> o.idnLangCode.asJson)
  }
  final implicit val DuplicateRequestEncoder: io.circe.Encoder[avias.route53domains.models.DuplicateRequest] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val GetOperationDetailRequestEncoder: io.circe.Encoder[avias.route53domains.models.GetOperationDetailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val GetDomainSuggestionsRequestEncoder: io.circe.Encoder[avias.route53domains.models.GetDomainSuggestionsRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "SuggestionCount" -> o.suggestionCount.asJson, "OnlyAvailable" -> o.onlyAvailable.asJson)
  }
  final implicit val OperationLimitExceededEncoder: io.circe.Encoder[avias.route53domains.models.OperationLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val RegisterDomainResponseEncoder: io.circe.Encoder[avias.route53domains.models.RegisterDomainResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val UpdateDomainContactPrivacyResponseEncoder: io.circe.Encoder[avias.route53domains.models.UpdateDomainContactPrivacyResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val EnableDomainTransferLockRequestEncoder: io.circe.Encoder[avias.route53domains.models.EnableDomainTransferLockRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val DisableDomainTransferLockRequestEncoder: io.circe.Encoder[avias.route53domains.models.DisableDomainTransferLockRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val UpdateDomainNameserversRequestEncoder: io.circe.Encoder[avias.route53domains.models.UpdateDomainNameserversRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "Nameservers" -> o.nameservers.asJson, "FIAuthKey" -> o.fiauthKey.asJson)
  }
  final implicit val CheckDomainTransferabilityRequestEncoder: io.circe.Encoder[avias.route53domains.models.CheckDomainTransferabilityRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "AuthCode" -> o.authCode.asJson)
  }
  final implicit val OperationSummaryEncoder: io.circe.Encoder[avias.route53domains.models.OperationSummary] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson, "Status" -> o.status.asJson, "Type" -> o.`type`.asJson, "SubmittedDate" -> o.submittedDate.asJson)
  }
  final implicit val RegisterDomainRequestEncoder: io.circe.Encoder[avias.route53domains.models.RegisterDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DurationInYears" -> o.durationInYears.asJson, "DomainName" -> o.domainName.asJson, "AdminContact" -> o.adminContact.asJson, "RegistrantContact" -> o.registrantContact.asJson, "TechContact" -> o.techContact.asJson, "IdnLangCode" -> o.idnLangCode.asJson, "AutoRenew" -> o.autoRenew.asJson, "PrivacyProtectAdminContact" -> o.privacyProtectAdminContact.asJson, "PrivacyProtectRegistrantContact" -> o.privacyProtectRegistrantContact.asJson, "PrivacyProtectTechContact" -> o.privacyProtectTechContact.asJson)
  }
  final implicit val DomainSummaryEncoder: io.circe.Encoder[avias.route53domains.models.DomainSummary] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "AutoRenew" -> o.autoRenew.asJson, "TransferLock" -> o.transferLock.asJson, "Expiry" -> o.expiry.asJson)
  }
  final implicit val DeleteTagsForDomainResponseEncoder: io.circe.Encoder[avias.route53domains.models.DeleteTagsForDomainResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetContactReachabilityStatusResponseEncoder: io.circe.Encoder[avias.route53domains.models.GetContactReachabilityStatusResponse] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson, "status" -> o.status.asJson)
  }
  final implicit val RenewDomainResponseEncoder: io.circe.Encoder[avias.route53domains.models.RenewDomainResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val GetDomainDetailResponseEncoder: io.circe.Encoder[avias.route53domains.models.GetDomainDetailResponse] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "Nameservers" -> o.nameservers.asJson, "AdminContact" -> o.adminContact.asJson, "RegistrantContact" -> o.registrantContact.asJson, "TechContact" -> o.techContact.asJson, "RegistrarName" -> o.registrarName.asJson, "CreationDate" -> o.creationDate.asJson, "UpdatedDate" -> o.updatedDate.asJson, "ExpirationDate" -> o.expirationDate.asJson, "AbuseContactEmail" -> o.abuseContactEmail.asJson, "StatusList" -> o.statusList.asJson, "WhoIsServer" -> o.whoIsServer.asJson, "AbuseContactPhone" -> o.abuseContactPhone.asJson, "DnsSec" -> o.dnsSec.asJson, "RegistrarUrl" -> o.registrarUrl.asJson, "Reseller" -> o.reseller.asJson, "AutoRenew" -> o.autoRenew.asJson, "AdminPrivacy" -> o.adminPrivacy.asJson, "RegistrantPrivacy" -> o.registrantPrivacy.asJson, "TechPrivacy" -> o.techPrivacy.asJson, "RegistryDomainId" -> o.registryDomainId.asJson)
  }
  final implicit val ViewBillingRequestEncoder: io.circe.Encoder[avias.route53domains.models.ViewBillingRequest] = io.circe.Encoder.instance { o => 
    Json.obj("Start" -> o.start.asJson, "End" -> o.end.asJson, "Marker" -> o.marker.asJson, "MaxItems" -> o.maxItems.asJson)
  }
  final implicit val CheckDomainTransferabilityResponseEncoder: io.circe.Encoder[avias.route53domains.models.CheckDomainTransferabilityResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Transferability" -> o.transferability.asJson)
  }
  final implicit val UpdateDomainNameserversResponseEncoder: io.circe.Encoder[avias.route53domains.models.UpdateDomainNameserversResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val RetrieveDomainAuthCodeRequestEncoder: io.circe.Encoder[avias.route53domains.models.RetrieveDomainAuthCodeRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val GetDomainSuggestionsResponseEncoder: io.circe.Encoder[avias.route53domains.models.GetDomainSuggestionsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("SuggestionsList" -> o.suggestionsList.asJson)
  }
  final implicit val TransferDomainRequestEncoder: io.circe.Encoder[avias.route53domains.models.TransferDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DurationInYears" -> o.durationInYears.asJson, "DomainName" -> o.domainName.asJson, "AdminContact" -> o.adminContact.asJson, "RegistrantContact" -> o.registrantContact.asJson, "TechContact" -> o.techContact.asJson, "Nameservers" -> o.nameservers.asJson, "IdnLangCode" -> o.idnLangCode.asJson, "AuthCode" -> o.authCode.asJson, "AutoRenew" -> o.autoRenew.asJson, "PrivacyProtectAdminContact" -> o.privacyProtectAdminContact.asJson, "PrivacyProtectRegistrantContact" -> o.privacyProtectRegistrantContact.asJson, "PrivacyProtectTechContact" -> o.privacyProtectTechContact.asJson)
  }
  final implicit val UpdateTagsForDomainResponseEncoder: io.circe.Encoder[avias.route53domains.models.UpdateTagsForDomainResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val GetDomainDetailRequestEncoder: io.circe.Encoder[avias.route53domains.models.GetDomainDetailRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val ResendContactReachabilityEmailResponseEncoder: io.circe.Encoder[avias.route53domains.models.ResendContactReachabilityEmailResponse] = io.circe.Encoder.instance { o => 
    Json.obj("domainName" -> o.domainName.asJson, "emailAddress" -> o.emailAddress.asJson, "isAlreadyVerified" -> o.isAlreadyVerified.asJson)
  }
  final implicit val ListOperationsResponseEncoder: io.circe.Encoder[avias.route53domains.models.ListOperationsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Operations" -> o.operations.asJson, "NextPageMarker" -> o.nextPageMarker.asJson)
  }
  final implicit val TagEncoder: io.circe.Encoder[avias.route53domains.models.Tag] = io.circe.Encoder.instance { o => 
    Json.obj("Key" -> o.key.asJson, "Value" -> o.value.asJson)
  }
  final implicit val ListTagsForDomainResponseEncoder: io.circe.Encoder[avias.route53domains.models.ListTagsForDomainResponse] = io.circe.Encoder.instance { o => 
    Json.obj("TagList" -> o.tagList.asJson)
  }
  final implicit val ListDomainsResponseEncoder: io.circe.Encoder[avias.route53domains.models.ListDomainsResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Domains" -> o.domains.asJson, "NextPageMarker" -> o.nextPageMarker.asJson)
  }
  final implicit val DisableDomainTransferLockResponseEncoder: io.circe.Encoder[avias.route53domains.models.DisableDomainTransferLockResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val ContactDetailEncoder: io.circe.Encoder[avias.route53domains.models.ContactDetail] = io.circe.Encoder.instance { o => 
    Json.obj("ContactType" -> o.contactType.asJson, "Email" -> o.email.asJson, "PhoneNumber" -> o.phoneNumber.asJson, "Fax" -> o.fax.asJson, "FirstName" -> o.firstName.asJson, "LastName" -> o.lastName.asJson, "OrganizationName" -> o.organizationName.asJson, "ExtraParams" -> o.extraParams.asJson, "State" -> o.state.asJson, "ZipCode" -> o.zipCode.asJson, "CountryCode" -> o.countryCode.asJson, "City" -> o.city.asJson, "AddressLine1" -> o.addressLine1.asJson, "AddressLine2" -> o.addressLine2.asJson)
  }
  final implicit val InvalidInputEncoder: io.circe.Encoder[avias.route53domains.models.InvalidInput] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val DomainTransferabilityEncoder: io.circe.Encoder[avias.route53domains.models.DomainTransferability] = io.circe.Encoder.instance { o => 
    Json.obj("Transferable" -> o.transferable.asJson)
  }
  final implicit val DisableDomainAutoRenewRequestEncoder: io.circe.Encoder[avias.route53domains.models.DisableDomainAutoRenewRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val DomainLimitExceededEncoder: io.circe.Encoder[avias.route53domains.models.DomainLimitExceeded] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateDomainContactResponseEncoder: io.circe.Encoder[avias.route53domains.models.UpdateDomainContactResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val TLDRulesViolationEncoder: io.circe.Encoder[avias.route53domains.models.TLDRulesViolation] = io.circe.Encoder.instance { o => 
    Json.obj("message" -> o.message.asJson)
  }
  final implicit val UpdateDomainContactRequestEncoder: io.circe.Encoder[avias.route53domains.models.UpdateDomainContactRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "AdminContact" -> o.adminContact.asJson, "RegistrantContact" -> o.registrantContact.asJson, "TechContact" -> o.techContact.asJson)
  }
  final implicit val EnableDomainTransferLockResponseEncoder: io.circe.Encoder[avias.route53domains.models.EnableDomainTransferLockResponse] = io.circe.Encoder.instance { o => 
    Json.obj("OperationId" -> o.operationId.asJson)
  }
  final implicit val UpdateTagsForDomainRequestEncoder: io.circe.Encoder[avias.route53domains.models.UpdateTagsForDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "TagsToUpdate" -> o.tagsToUpdate.asJson)
  }
  final implicit val CheckDomainAvailabilityResponseEncoder: io.circe.Encoder[avias.route53domains.models.CheckDomainAvailabilityResponse] = io.circe.Encoder.instance { o => 
    Json.obj("Availability" -> o.availability.asJson)
  }
  final implicit val ListTagsForDomainRequestEncoder: io.circe.Encoder[avias.route53domains.models.ListTagsForDomainRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val EnableDomainAutoRenewResponseEncoder: io.circe.Encoder[avias.route53domains.models.EnableDomainAutoRenewResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val EnableDomainAutoRenewRequestEncoder: io.circe.Encoder[avias.route53domains.models.EnableDomainAutoRenewRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson)
  }
  final implicit val GetOperationDetailResponseEncoder: io.circe.Encoder[avias.route53domains.models.GetOperationDetailResponse] = io.circe.Encoder.instance { o => 
    Json.obj("SubmittedDate" -> o.submittedDate.asJson, "OperationId" -> o.operationId.asJson, "Type" -> o.`type`.asJson, "Status" -> o.status.asJson, "DomainName" -> o.domainName.asJson, "Message" -> o.message.asJson)
  }
  final implicit val UpdateDomainContactPrivacyRequestEncoder: io.circe.Encoder[avias.route53domains.models.UpdateDomainContactPrivacyRequest] = io.circe.Encoder.instance { o => 
    Json.obj("DomainName" -> o.domainName.asJson, "AdminPrivacy" -> o.adminPrivacy.asJson, "RegistrantPrivacy" -> o.registrantPrivacy.asJson, "TechPrivacy" -> o.techPrivacy.asJson)
  }
  final implicit val DisableDomainAutoRenewResponseEncoder: io.circe.Encoder[avias.route53domains.models.DisableDomainAutoRenewResponse.type] = io.circe.Encoder.instance {
    o => Json.obj()
  }
  final implicit val RetrieveDomainAuthCodeResponseEncoder: io.circe.Encoder[avias.route53domains.models.RetrieveDomainAuthCodeResponse] = io.circe.Encoder.instance { o => 
    Json.obj("AuthCode" -> o.authCode.asJson)
  }
  final implicit val BillingRecordDecoder: io.circe.Decoder[avias.route53domains.models.BillingRecord] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("BillDate"), o.get[scala.Option[scala.Double]]("Price"), o.get[scala.Option[java.lang.String]]("Operation"), o.get[scala.Option[java.lang.String]]("DomainName"), o.get[scala.Option[java.lang.String]]("InvoiceId")).mapN(avias.route53domains.models.BillingRecord.apply _)
  }
  final implicit val ExtraParamDecoder: io.circe.Decoder[avias.route53domains.models.ExtraParam] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[java.lang.String]("Value")).mapN(avias.route53domains.models.ExtraParam.apply _)
  }
  final implicit val ViewBillingResponseDecoder: io.circe.Decoder[avias.route53domains.models.ViewBillingResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("NextPageMarker"), o.get[scala.Option[scala.List[avias.route53domains.models.BillingRecord]]]("BillingRecords")).mapN(avias.route53domains.models.ViewBillingResponse.apply _)
  }
  final implicit val RenewDomainRequestDecoder: io.circe.Decoder[avias.route53domains.models.RenewDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Int]("CurrentExpiryYear"), o.get[scala.Option[scala.Int]]("DurationInYears")).mapN(avias.route53domains.models.RenewDomainRequest.apply _)
  }
  final implicit val UnsupportedTLDDecoder: io.circe.Decoder[avias.route53domains.models.UnsupportedTLD] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.route53domains.models.UnsupportedTLD.apply _)
  }
  final implicit val TransferDomainResponseDecoder: io.circe.Decoder[avias.route53domains.models.TransferDomainResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(avias.route53domains.models.TransferDomainResponse.apply _)
  }
  final implicit val GetContactReachabilityStatusRequestDecoder: io.circe.Decoder[avias.route53domains.models.GetContactReachabilityStatusRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("domainName").map(avias.route53domains.models.GetContactReachabilityStatusRequest.apply _)
  }
  final implicit val NameserverDecoder: io.circe.Decoder[avias.route53domains.models.Nameserver] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("Name"), o.get[scala.Option[scala.List[java.lang.String]]]("GlueIps")).mapN(avias.route53domains.models.Nameserver.apply _)
  }
  final implicit val ListDomainsRequestDecoder: io.circe.Decoder[avias.route53domains.models.ListDomainsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("MaxItems")).mapN(avias.route53domains.models.ListDomainsRequest.apply _)
  }
  final implicit val DeleteTagsForDomainRequestDecoder: io.circe.Decoder[avias.route53domains.models.DeleteTagsForDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.List[java.lang.String]]("TagsToDelete")).mapN(avias.route53domains.models.DeleteTagsForDomainRequest.apply _)
  }
  final implicit val DomainSuggestionDecoder: io.circe.Decoder[avias.route53domains.models.DomainSuggestion] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("DomainName"), o.get[scala.Option[java.lang.String]]("Availability")).mapN(avias.route53domains.models.DomainSuggestion.apply _)
  }
  final implicit val ListOperationsRequestDecoder: io.circe.Decoder[avias.route53domains.models.ListOperationsRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("MaxItems")).mapN(avias.route53domains.models.ListOperationsRequest.apply _)
  }
  final implicit val ResendContactReachabilityEmailRequestDecoder: io.circe.Decoder[avias.route53domains.models.ResendContactReachabilityEmailRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("domainName").map(avias.route53domains.models.ResendContactReachabilityEmailRequest.apply _)
  }
  final implicit val CheckDomainAvailabilityRequestDecoder: io.circe.Decoder[avias.route53domains.models.CheckDomainAvailabilityRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[java.lang.String]]("IdnLangCode")).mapN(avias.route53domains.models.CheckDomainAvailabilityRequest.apply _)
  }
  final implicit val DuplicateRequestDecoder: io.circe.Decoder[avias.route53domains.models.DuplicateRequest] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.route53domains.models.DuplicateRequest.apply _)
  }
  final implicit val GetOperationDetailRequestDecoder: io.circe.Decoder[avias.route53domains.models.GetOperationDetailRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(avias.route53domains.models.GetOperationDetailRequest.apply _)
  }
  final implicit val GetDomainSuggestionsRequestDecoder: io.circe.Decoder[avias.route53domains.models.GetDomainSuggestionsRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Int]("SuggestionCount"), o.get[scala.Boolean]("OnlyAvailable")).mapN(avias.route53domains.models.GetDomainSuggestionsRequest.apply _)
  }
  final implicit val OperationLimitExceededDecoder: io.circe.Decoder[avias.route53domains.models.OperationLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.route53domains.models.OperationLimitExceeded.apply _)
  }
  final implicit val RegisterDomainResponseDecoder: io.circe.Decoder[avias.route53domains.models.RegisterDomainResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(avias.route53domains.models.RegisterDomainResponse.apply _)
  }
  final implicit val UpdateDomainContactPrivacyResponseDecoder: io.circe.Decoder[avias.route53domains.models.UpdateDomainContactPrivacyResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(avias.route53domains.models.UpdateDomainContactPrivacyResponse.apply _)
  }
  final implicit val EnableDomainTransferLockRequestDecoder: io.circe.Decoder[avias.route53domains.models.EnableDomainTransferLockRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(avias.route53domains.models.EnableDomainTransferLockRequest.apply _)
  }
  final implicit val DisableDomainTransferLockRequestDecoder: io.circe.Decoder[avias.route53domains.models.DisableDomainTransferLockRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(avias.route53domains.models.DisableDomainTransferLockRequest.apply _)
  }
  final implicit val UpdateDomainNameserversRequestDecoder: io.circe.Decoder[avias.route53domains.models.UpdateDomainNameserversRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.List[avias.route53domains.models.Nameserver]]("Nameservers"), o.get[scala.Option[java.lang.String]]("FIAuthKey")).mapN(avias.route53domains.models.UpdateDomainNameserversRequest.apply _)
  }
  final implicit val CheckDomainTransferabilityRequestDecoder: io.circe.Decoder[avias.route53domains.models.CheckDomainTransferabilityRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[java.lang.String]]("AuthCode")).mapN(avias.route53domains.models.CheckDomainTransferabilityRequest.apply _)
  }
  final implicit val OperationSummaryDecoder: io.circe.Decoder[avias.route53domains.models.OperationSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("OperationId"), o.get[java.lang.String]("Status"), o.get[java.lang.String]("Type"), o.get[java.time.Instant]("SubmittedDate")).mapN(avias.route53domains.models.OperationSummary.apply _)
  }
  final implicit val RegisterDomainRequestDecoder: io.circe.Decoder[avias.route53domains.models.RegisterDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("DurationInYears"), o.get[java.lang.String]("DomainName"), o.get[avias.route53domains.models.ContactDetail]("AdminContact"), o.get[avias.route53domains.models.ContactDetail]("RegistrantContact"), o.get[avias.route53domains.models.ContactDetail]("TechContact"), o.get[scala.Option[java.lang.String]]("IdnLangCode"), o.get[scala.Option[scala.Boolean]]("AutoRenew"), o.get[scala.Option[scala.Boolean]]("PrivacyProtectAdminContact"), o.get[scala.Option[scala.Boolean]]("PrivacyProtectRegistrantContact"), o.get[scala.Option[scala.Boolean]]("PrivacyProtectTechContact")).mapN(avias.route53domains.models.RegisterDomainRequest.apply _)
  }
  final implicit val DomainSummaryDecoder: io.circe.Decoder[avias.route53domains.models.DomainSummary] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[scala.Boolean]]("AutoRenew"), o.get[scala.Option[scala.Boolean]]("TransferLock"), o.get[scala.Option[java.time.Instant]]("Expiry")).mapN(avias.route53domains.models.DomainSummary.apply _)
  }
  final implicit val DeleteTagsForDomainResponseDecoder: io.circe.Decoder[avias.route53domains.models.DeleteTagsForDomainResponse.type] = io.circe.Decoder.decodeUnit.as(avias.route53domains.models.DeleteTagsForDomainResponse)
  final implicit val GetContactReachabilityStatusResponseDecoder: io.circe.Decoder[avias.route53domains.models.GetContactReachabilityStatusResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("domainName"), o.get[scala.Option[java.lang.String]]("status")).mapN(avias.route53domains.models.GetContactReachabilityStatusResponse.apply _)
  }
  final implicit val RenewDomainResponseDecoder: io.circe.Decoder[avias.route53domains.models.RenewDomainResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(avias.route53domains.models.RenewDomainResponse.apply _)
  }
  final implicit val GetDomainDetailResponseDecoder: io.circe.Decoder[avias.route53domains.models.GetDomainDetailResponse] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.List[avias.route53domains.models.Nameserver]]("Nameservers"), o.get[avias.route53domains.models.ContactDetail]("AdminContact"), o.get[avias.route53domains.models.ContactDetail]("RegistrantContact"), o.get[avias.route53domains.models.ContactDetail]("TechContact"), o.get[scala.Option[java.lang.String]]("RegistrarName"), o.get[scala.Option[java.time.Instant]]("CreationDate"), o.get[scala.Option[java.time.Instant]]("UpdatedDate"), o.get[scala.Option[java.time.Instant]]("ExpirationDate"), o.get[scala.Option[java.lang.String]]("AbuseContactEmail"), o.get[scala.Option[scala.List[java.lang.String]]]("StatusList"), o.get[scala.Option[java.lang.String]]("WhoIsServer"), o.get[scala.Option[java.lang.String]]("AbuseContactPhone"), o.get[scala.Option[java.lang.String]]("DnsSec"), o.get[scala.Option[java.lang.String]]("RegistrarUrl"), o.get[scala.Option[java.lang.String]]("Reseller"), o.get[scala.Option[scala.Boolean]]("AutoRenew"), o.get[scala.Option[scala.Boolean]]("AdminPrivacy"), o.get[scala.Option[scala.Boolean]]("RegistrantPrivacy"), o.get[scala.Option[scala.Boolean]]("TechPrivacy"), o.get[scala.Option[java.lang.String]]("RegistryDomainId")).mapN(avias.route53domains.models.GetDomainDetailResponse.apply _)
  }
  final implicit val ViewBillingRequestDecoder: io.circe.Decoder[avias.route53domains.models.ViewBillingRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("Start"), o.get[scala.Option[java.time.Instant]]("End"), o.get[scala.Option[java.lang.String]]("Marker"), o.get[scala.Option[scala.Int]]("MaxItems")).mapN(avias.route53domains.models.ViewBillingRequest.apply _)
  }
  final implicit val CheckDomainTransferabilityResponseDecoder: io.circe.Decoder[avias.route53domains.models.CheckDomainTransferabilityResponse] = io.circe.Decoder.instance { o => 
    o.get[avias.route53domains.models.DomainTransferability]("Transferability").map(avias.route53domains.models.CheckDomainTransferabilityResponse.apply _)
  }
  final implicit val UpdateDomainNameserversResponseDecoder: io.circe.Decoder[avias.route53domains.models.UpdateDomainNameserversResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(avias.route53domains.models.UpdateDomainNameserversResponse.apply _)
  }
  final implicit val RetrieveDomainAuthCodeRequestDecoder: io.circe.Decoder[avias.route53domains.models.RetrieveDomainAuthCodeRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(avias.route53domains.models.RetrieveDomainAuthCodeRequest.apply _)
  }
  final implicit val GetDomainSuggestionsResponseDecoder: io.circe.Decoder[avias.route53domains.models.GetDomainSuggestionsResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[scala.List[avias.route53domains.models.DomainSuggestion]]]("SuggestionsList").map(avias.route53domains.models.GetDomainSuggestionsResponse.apply _)
  }
  final implicit val TransferDomainRequestDecoder: io.circe.Decoder[avias.route53domains.models.TransferDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[scala.Int]("DurationInYears"), o.get[java.lang.String]("DomainName"), o.get[avias.route53domains.models.ContactDetail]("AdminContact"), o.get[avias.route53domains.models.ContactDetail]("RegistrantContact"), o.get[avias.route53domains.models.ContactDetail]("TechContact"), o.get[scala.Option[scala.List[avias.route53domains.models.Nameserver]]]("Nameservers"), o.get[scala.Option[java.lang.String]]("IdnLangCode"), o.get[scala.Option[java.lang.String]]("AuthCode"), o.get[scala.Option[scala.Boolean]]("AutoRenew"), o.get[scala.Option[scala.Boolean]]("PrivacyProtectAdminContact"), o.get[scala.Option[scala.Boolean]]("PrivacyProtectRegistrantContact"), o.get[scala.Option[scala.Boolean]]("PrivacyProtectTechContact")).mapN(avias.route53domains.models.TransferDomainRequest.apply _)
  }
  final implicit val UpdateTagsForDomainResponseDecoder: io.circe.Decoder[avias.route53domains.models.UpdateTagsForDomainResponse.type] = io.circe.Decoder.decodeUnit.as(avias.route53domains.models.UpdateTagsForDomainResponse)
  final implicit val GetDomainDetailRequestDecoder: io.circe.Decoder[avias.route53domains.models.GetDomainDetailRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(avias.route53domains.models.GetDomainDetailRequest.apply _)
  }
  final implicit val ResendContactReachabilityEmailResponseDecoder: io.circe.Decoder[avias.route53domains.models.ResendContactReachabilityEmailResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("domainName"), o.get[scala.Option[java.lang.String]]("emailAddress"), o.get[scala.Option[scala.Boolean]]("isAlreadyVerified")).mapN(avias.route53domains.models.ResendContactReachabilityEmailResponse.apply _)
  }
  final implicit val ListOperationsResponseDecoder: io.circe.Decoder[avias.route53domains.models.ListOperationsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.route53domains.models.OperationSummary]]("Operations"), o.get[scala.Option[java.lang.String]]("NextPageMarker")).mapN(avias.route53domains.models.ListOperationsResponse.apply _)
  }
  final implicit val TagDecoder: io.circe.Decoder[avias.route53domains.models.Tag] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("Key"), o.get[scala.Option[java.lang.String]]("Value")).mapN(avias.route53domains.models.Tag.apply _)
  }
  final implicit val ListTagsForDomainResponseDecoder: io.circe.Decoder[avias.route53domains.models.ListTagsForDomainResponse] = io.circe.Decoder.instance { o => 
    o.get[scala.List[avias.route53domains.models.Tag]]("TagList").map(avias.route53domains.models.ListTagsForDomainResponse.apply _)
  }
  final implicit val ListDomainsResponseDecoder: io.circe.Decoder[avias.route53domains.models.ListDomainsResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.List[avias.route53domains.models.DomainSummary]]("Domains"), o.get[scala.Option[java.lang.String]]("NextPageMarker")).mapN(avias.route53domains.models.ListDomainsResponse.apply _)
  }
  final implicit val DisableDomainTransferLockResponseDecoder: io.circe.Decoder[avias.route53domains.models.DisableDomainTransferLockResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(avias.route53domains.models.DisableDomainTransferLockResponse.apply _)
  }
  final implicit val ContactDetailDecoder: io.circe.Decoder[avias.route53domains.models.ContactDetail] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.lang.String]]("ContactType"), o.get[scala.Option[java.lang.String]]("Email"), o.get[scala.Option[java.lang.String]]("PhoneNumber"), o.get[scala.Option[java.lang.String]]("Fax"), o.get[scala.Option[java.lang.String]]("FirstName"), o.get[scala.Option[java.lang.String]]("LastName"), o.get[scala.Option[java.lang.String]]("OrganizationName"), o.get[scala.Option[scala.List[avias.route53domains.models.ExtraParam]]]("ExtraParams"), o.get[scala.Option[java.lang.String]]("State"), o.get[scala.Option[java.lang.String]]("ZipCode"), o.get[scala.Option[java.lang.String]]("CountryCode"), o.get[scala.Option[java.lang.String]]("City"), o.get[scala.Option[java.lang.String]]("AddressLine1"), o.get[scala.Option[java.lang.String]]("AddressLine2")).mapN(avias.route53domains.models.ContactDetail.apply _)
  }
  final implicit val InvalidInputDecoder: io.circe.Decoder[avias.route53domains.models.InvalidInput] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.route53domains.models.InvalidInput.apply _)
  }
  final implicit val DomainTransferabilityDecoder: io.circe.Decoder[avias.route53domains.models.DomainTransferability] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("Transferable").map(avias.route53domains.models.DomainTransferability.apply _)
  }
  final implicit val DisableDomainAutoRenewRequestDecoder: io.circe.Decoder[avias.route53domains.models.DisableDomainAutoRenewRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(avias.route53domains.models.DisableDomainAutoRenewRequest.apply _)
  }
  final implicit val DomainLimitExceededDecoder: io.circe.Decoder[avias.route53domains.models.DomainLimitExceeded] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.route53domains.models.DomainLimitExceeded.apply _)
  }
  final implicit val UpdateDomainContactResponseDecoder: io.circe.Decoder[avias.route53domains.models.UpdateDomainContactResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(avias.route53domains.models.UpdateDomainContactResponse.apply _)
  }
  final implicit val TLDRulesViolationDecoder: io.circe.Decoder[avias.route53domains.models.TLDRulesViolation] = io.circe.Decoder.instance { o => 
    o.get[scala.Option[java.lang.String]]("message").map(avias.route53domains.models.TLDRulesViolation.apply _)
  }
  final implicit val UpdateDomainContactRequestDecoder: io.circe.Decoder[avias.route53domains.models.UpdateDomainContactRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[avias.route53domains.models.ContactDetail]]("AdminContact"), o.get[scala.Option[avias.route53domains.models.ContactDetail]]("RegistrantContact"), o.get[scala.Option[avias.route53domains.models.ContactDetail]]("TechContact")).mapN(avias.route53domains.models.UpdateDomainContactRequest.apply _)
  }
  final implicit val EnableDomainTransferLockResponseDecoder: io.circe.Decoder[avias.route53domains.models.EnableDomainTransferLockResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("OperationId").map(avias.route53domains.models.EnableDomainTransferLockResponse.apply _)
  }
  final implicit val UpdateTagsForDomainRequestDecoder: io.circe.Decoder[avias.route53domains.models.UpdateTagsForDomainRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[scala.List[avias.route53domains.models.Tag]]]("TagsToUpdate")).mapN(avias.route53domains.models.UpdateTagsForDomainRequest.apply _)
  }
  final implicit val CheckDomainAvailabilityResponseDecoder: io.circe.Decoder[avias.route53domains.models.CheckDomainAvailabilityResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("Availability").map(avias.route53domains.models.CheckDomainAvailabilityResponse.apply _)
  }
  final implicit val ListTagsForDomainRequestDecoder: io.circe.Decoder[avias.route53domains.models.ListTagsForDomainRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(avias.route53domains.models.ListTagsForDomainRequest.apply _)
  }
  final implicit val EnableDomainAutoRenewResponseDecoder: io.circe.Decoder[avias.route53domains.models.EnableDomainAutoRenewResponse.type] = io.circe.Decoder.decodeUnit.as(avias.route53domains.models.EnableDomainAutoRenewResponse)
  final implicit val EnableDomainAutoRenewRequestDecoder: io.circe.Decoder[avias.route53domains.models.EnableDomainAutoRenewRequest] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("DomainName").map(avias.route53domains.models.EnableDomainAutoRenewRequest.apply _)
  }
  final implicit val GetOperationDetailResponseDecoder: io.circe.Decoder[avias.route53domains.models.GetOperationDetailResponse] = io.circe.Decoder.instance { o => 
    (o.get[scala.Option[java.time.Instant]]("SubmittedDate"), o.get[scala.Option[java.lang.String]]("OperationId"), o.get[scala.Option[java.lang.String]]("Type"), o.get[scala.Option[java.lang.String]]("Status"), o.get[scala.Option[java.lang.String]]("DomainName"), o.get[scala.Option[java.lang.String]]("Message")).mapN(avias.route53domains.models.GetOperationDetailResponse.apply _)
  }
  final implicit val UpdateDomainContactPrivacyRequestDecoder: io.circe.Decoder[avias.route53domains.models.UpdateDomainContactPrivacyRequest] = io.circe.Decoder.instance { o => 
    (o.get[java.lang.String]("DomainName"), o.get[scala.Option[scala.Boolean]]("AdminPrivacy"), o.get[scala.Option[scala.Boolean]]("RegistrantPrivacy"), o.get[scala.Option[scala.Boolean]]("TechPrivacy")).mapN(avias.route53domains.models.UpdateDomainContactPrivacyRequest.apply _)
  }
  final implicit val DisableDomainAutoRenewResponseDecoder: io.circe.Decoder[avias.route53domains.models.DisableDomainAutoRenewResponse.type] = io.circe.Decoder.decodeUnit.as(avias.route53domains.models.DisableDomainAutoRenewResponse)
  final implicit val RetrieveDomainAuthCodeResponseDecoder: io.circe.Decoder[avias.route53domains.models.RetrieveDomainAuthCodeResponse] = io.circe.Decoder.instance { o => 
    o.get[java.lang.String]("AuthCode").map(avias.route53domains.models.RetrieveDomainAuthCodeResponse.apply _)
  }
}