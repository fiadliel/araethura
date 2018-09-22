package avias.servermigration.http4s
import org.http4s.Method._
import avias.servermigration.circe._
import avias.servermigration.models
import avias.common.http4s.ClientUtils._
class AmazonservermigrationClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.servermigration.Amazonservermigration[F] {
  private[this] final val ServiceType: String = "sms"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSServerMigrationService_V2016_10_24")
  override def getReplicationRuns(input: avias.servermigration.models.GetReplicationRunsRequest): F[avias.servermigration.models.GetReplicationRunsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.servermigration.models.GetReplicationRunsResponse, avias.servermigration.models.GetReplicationRunsRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetReplicationRuns", POST, "/", input)
  override def updateReplicationJob(input: avias.servermigration.models.UpdateReplicationJobRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.servermigration.models.UpdateReplicationJobRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateReplicationJob", POST, "/", input)
  override def getServers(input: avias.servermigration.models.GetServersRequest): F[avias.servermigration.models.GetServersResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.servermigration.models.GetServersResponse, avias.servermigration.models.GetServersRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetServers", POST, "/", input)
  override def getConnectors(input: avias.servermigration.models.GetConnectorsRequest): F[avias.servermigration.models.GetConnectorsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.servermigration.models.GetConnectorsResponse, avias.servermigration.models.GetConnectorsRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetConnectors", POST, "/", input)
  override def startOnDemandReplicationRun(input: avias.servermigration.models.StartOnDemandReplicationRunRequest): F[avias.servermigration.models.StartOnDemandReplicationRunResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.servermigration.models.StartOnDemandReplicationRunResponse, avias.servermigration.models.StartOnDemandReplicationRunRequest](client, awsData, ServiceType, ServiceAndPrefix, "StartOnDemandReplicationRun", POST, "/", input)
  override def deleteReplicationJob(input: avias.servermigration.models.DeleteReplicationJobRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.servermigration.models.DeleteReplicationJobRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteReplicationJob", POST, "/", input)
  override def disassociateConnector(input: avias.servermigration.models.DisassociateConnectorRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.servermigration.models.DisassociateConnectorRequest](client, awsData, ServiceType, ServiceAndPrefix, "DisassociateConnector", POST, "/", input)
  override def getReplicationJobs(input: avias.servermigration.models.GetReplicationJobsRequest): F[avias.servermigration.models.GetReplicationJobsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.servermigration.models.GetReplicationJobsResponse, avias.servermigration.models.GetReplicationJobsRequest](client, awsData, ServiceType, ServiceAndPrefix, "GetReplicationJobs", POST, "/", input)
  override def deleteServerCatalog: F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "DeleteServerCatalog", POST, "/", ())
  override def importServerCatalog: F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "ImportServerCatalog", POST, "/", ())
  override def createReplicationJob(input: avias.servermigration.models.CreateReplicationJobRequest): F[avias.servermigration.models.CreateReplicationJobResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.servermigration.models.CreateReplicationJobResponse, avias.servermigration.models.CreateReplicationJobRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateReplicationJob", POST, "/", input)
}