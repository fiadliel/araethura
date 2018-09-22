package avias.cloudtrail.http4s
import org.http4s.Method._
import avias.cloudtrail.circe._
import avias.cloudtrail.models
import avias.common.http4s.ClientUtils._
class AmazoncloudtrailClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.cloudtrail.Amazoncloudtrail[F] {
  private[this] final val ServiceType: String = "cloudtrail"
  private[this] final val ServiceAndPrefix: Option[String] = Some("com.amazonaws.cloudtrail.v20131101.CloudTrail_20131101")
  override def addTags(input: avias.cloudtrail.models.AddTagsRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.cloudtrail.models.AddTagsRequest](client, awsData, ServiceType, ServiceAndPrefix, "AddTags", POST, "/", input)
  override def listTags(input: avias.cloudtrail.models.ListTagsRequest): F[avias.cloudtrail.models.ListTagsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudtrail.models.ListTagsResponse, avias.cloudtrail.models.ListTagsRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListTags", POST, "/", input)
  override def createTrail(input: avias.cloudtrail.models.CreateTrailRequest): F[avias.cloudtrail.models.CreateTrailResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudtrail.models.CreateTrailResponse, avias.cloudtrail.models.CreateTrailRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateTrail", POST, "/", input)
  override def describeTrails(input: avias.cloudtrail.models.DescribeTrailsRequest): F[avias.cloudtrail.models.DescribeTrailsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudtrail.models.DescribeTrailsResponse, avias.cloudtrail.models.DescribeTrailsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeTrails", POST, "/", input)
  override def startLogging(input: avias.cloudtrail.models.StartLoggingRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.cloudtrail.models.StartLoggingRequest](client, awsData, ServiceType, ServiceAndPrefix, "StartLogging", POST, "/", input)
  override def lookupEvents(input: avias.cloudtrail.models.LookupEventsRequest): F[avias.cloudtrail.models.LookupEventsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudtrail.models.LookupEventsResponse, avias.cloudtrail.models.LookupEventsRequest](client, awsData, ServiceType, ServiceAndPrefix, "LookupEvents", POST, "/", input)
  override def stopLogging(input: avias.cloudtrail.models.StopLoggingRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.cloudtrail.models.StopLoggingRequest](client, awsData, ServiceType, ServiceAndPrefix, "StopLogging", POST, "/", input)
  override def removeTags(input: avias.cloudtrail.models.RemoveTagsRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.cloudtrail.models.RemoveTagsRequest](client, awsData, ServiceType, ServiceAndPrefix, "RemoveTags", POST, "/", input)
  override def deleteTrail(input: avias.cloudtrail.models.DeleteTrailRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.cloudtrail.models.DeleteTrailRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteTrail", POST, "/", input)
  override def updateTrail(input: avias.cloudtrail.models.UpdateTrailRequest): F[avias.cloudtrail.models.UpdateTrailResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudtrail.models.UpdateTrailResponse, avias.cloudtrail.models.UpdateTrailRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateTrail", POST, "/", input)
  override def putEventSelectors(input: avias.cloudtrail.models.PutEventSelectorsRequest): F[avias.cloudtrail.models.PutEventSelectorsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudtrail.models.PutEventSelectorsResponse, avias.cloudtrail.models.PutEventSelectorsRequest](client, awsData, ServiceType, ServiceAndPrefix, "PutEventSelectors", POST, "/", input)
  override def getEventSelectors(input: avias.cloudtrail.models.GetEventSelectorsRequest): F[avias.cloudtrail.models.GetEventSelectorsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudtrail.models.GetEventSelectorsResponse, avias.cloudtrail.models.GetEventSelectorsRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetEventSelectors", POST, "/", input)
  override def getTrailStatus(input: avias.cloudtrail.models.GetTrailStatusRequest): F[avias.cloudtrail.models.GetTrailStatusResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudtrail.models.GetTrailStatusResponse, avias.cloudtrail.models.GetTrailStatusRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetTrailStatus", POST, "/", input)
  override def listPublicKeys(input: avias.cloudtrail.models.ListPublicKeysRequest): F[avias.cloudtrail.models.ListPublicKeysResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.cloudtrail.models.ListPublicKeysResponse, avias.cloudtrail.models.ListPublicKeysRequest](client, awsData, ServiceType, ServiceAndPrefix, "ListPublicKeys", POST, "/", input)
}