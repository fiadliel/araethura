package avias.codebuild.http4s
import org.http4s.Method._
import avias.codebuild.circe._
import avias.codebuild.models
import avias.common.http4s.ClientUtils._
class AmazoncodebuildClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.codebuild.Amazoncodebuild[F] {
  private[this] final val ServiceType: String = "codebuild"
  private[this] final val ServiceAndPrefix: Option[String] = Some("CodeBuild_20161006")
  override def listCuratedEnvironmentImages: F[avias.codebuild.models.ListCuratedEnvironmentImagesOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codebuild.models.ListCuratedEnvironmentImagesOutput, scala.Unit](client, awsData, ServiceType, ServiceAndPrefix, "ListCuratedEnvironmentImages", POST, "/", ())
  override def createProject(input: avias.codebuild.models.CreateProjectInput): F[avias.codebuild.models.CreateProjectOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codebuild.models.CreateProjectOutput, avias.codebuild.models.CreateProjectInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateProject", POST, "/", input)
  override def listProjects(input: avias.codebuild.models.ListProjectsInput): F[avias.codebuild.models.ListProjectsOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codebuild.models.ListProjectsOutput, avias.codebuild.models.ListProjectsInput](client, awsData, ServiceType, ServiceAndPrefix, "ListProjects", POST, "/", input)
  override def batchGetBuilds(input: avias.codebuild.models.BatchGetBuildsInput): F[avias.codebuild.models.BatchGetBuildsOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codebuild.models.BatchGetBuildsOutput, avias.codebuild.models.BatchGetBuildsInput](client, awsData, ServiceType, ServiceAndPrefix, "BatchGetBuilds", POST, "/", input)
  override def createWebhook(input: avias.codebuild.models.CreateWebhookInput): F[avias.codebuild.models.CreateWebhookOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codebuild.models.CreateWebhookOutput, avias.codebuild.models.CreateWebhookInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateWebhook", POST, "/", input)
  override def listBuildsForProject(input: avias.codebuild.models.ListBuildsForProjectInput): F[avias.codebuild.models.ListBuildsForProjectOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codebuild.models.ListBuildsForProjectOutput, avias.codebuild.models.ListBuildsForProjectInput](client, awsData, ServiceType, ServiceAndPrefix, "ListBuildsForProject", POST, "/", input)
  override def batchGetProjects(input: avias.codebuild.models.BatchGetProjectsInput): F[avias.codebuild.models.BatchGetProjectsOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codebuild.models.BatchGetProjectsOutput, avias.codebuild.models.BatchGetProjectsInput](client, awsData, ServiceType, ServiceAndPrefix, "BatchGetProjects", POST, "/", input)
  override def listBuilds(input: avias.codebuild.models.ListBuildsInput): F[avias.codebuild.models.ListBuildsOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codebuild.models.ListBuildsOutput, avias.codebuild.models.ListBuildsInput](client, awsData, ServiceType, ServiceAndPrefix, "ListBuilds", POST, "/", input)
  override def deleteWebhook(input: avias.codebuild.models.DeleteWebhookInput): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.codebuild.models.DeleteWebhookInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteWebhook", POST, "/", input)
  override def stopBuild(input: avias.codebuild.models.StopBuildInput): F[avias.codebuild.models.StopBuildOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codebuild.models.StopBuildOutput, avias.codebuild.models.StopBuildInput](client, awsData, ServiceType, ServiceAndPrefix, "StopBuild", POST, "/", input)
  override def deleteProject(input: avias.codebuild.models.DeleteProjectInput): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.codebuild.models.DeleteProjectInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteProject", POST, "/", input)
  override def batchDeleteBuilds(input: avias.codebuild.models.BatchDeleteBuildsInput): F[avias.codebuild.models.BatchDeleteBuildsOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codebuild.models.BatchDeleteBuildsOutput, avias.codebuild.models.BatchDeleteBuildsInput](client, awsData, ServiceType, ServiceAndPrefix, "BatchDeleteBuilds", POST, "/", input)
  override def startBuild(input: avias.codebuild.models.StartBuildInput): F[avias.codebuild.models.StartBuildOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codebuild.models.StartBuildOutput, avias.codebuild.models.StartBuildInput](client, awsData, ServiceType, ServiceAndPrefix, "StartBuild", POST, "/", input)
  override def updateProject(input: avias.codebuild.models.UpdateProjectInput): F[avias.codebuild.models.UpdateProjectOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codebuild.models.UpdateProjectOutput, avias.codebuild.models.UpdateProjectInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateProject", POST, "/", input)
}