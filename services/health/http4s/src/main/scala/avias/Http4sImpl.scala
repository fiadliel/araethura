package avias.health.http4s
import org.http4s.Method._
import avias.health.circe._
import avias.health.models
import avias.common.http4s.ClientUtils._
class AmazonhealthClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.health.Amazonhealth[F] {
  private[this] final val ServiceType: String = "health"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSHealth_20160804")
  override def describeEventDetails(input: avias.health.models.DescribeEventDetailsRequest): F[avias.health.models.DescribeEventDetailsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.health.models.DescribeEventDetailsResponse, avias.health.models.DescribeEventDetailsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEventDetails", POST, "/", input)
  override def describeEntityAggregates(input: avias.health.models.DescribeEntityAggregatesRequest): F[avias.health.models.DescribeEntityAggregatesResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.health.models.DescribeEntityAggregatesResponse, avias.health.models.DescribeEntityAggregatesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEntityAggregates", POST, "/", input)
  override def describeEventAggregates(input: avias.health.models.DescribeEventAggregatesRequest): F[avias.health.models.DescribeEventAggregatesResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.health.models.DescribeEventAggregatesResponse, avias.health.models.DescribeEventAggregatesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEventAggregates", POST, "/", input)
  override def describeAffectedEntities(input: avias.health.models.DescribeAffectedEntitiesRequest): F[avias.health.models.DescribeAffectedEntitiesResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.health.models.DescribeAffectedEntitiesResponse, avias.health.models.DescribeAffectedEntitiesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeAffectedEntities", POST, "/", input)
  override def describeEventTypes(input: avias.health.models.DescribeEventTypesRequest): F[avias.health.models.DescribeEventTypesResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.health.models.DescribeEventTypesResponse, avias.health.models.DescribeEventTypesRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEventTypes", POST, "/", input)
  override def describeEvents(input: avias.health.models.DescribeEventsRequest): F[avias.health.models.DescribeEventsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.health.models.DescribeEventsResponse, avias.health.models.DescribeEventsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeEvents", POST, "/", input)
}