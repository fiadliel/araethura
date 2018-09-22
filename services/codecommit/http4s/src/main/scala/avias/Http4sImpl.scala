package avias.codecommit.http4s
import org.http4s.Method._
import avias.codecommit.circe._
import avias.codecommit.models
import avias.common.http4s.ClientUtils._
class AmazoncodecommitClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.codecommit.Amazoncodecommit[F] {
  private[this] final val ServiceType: String = "codecommit"
  private[this] final val ServiceAndPrefix: Option[String] = Some("CodeCommit_20150413")
  override def getDifferences(input: avias.codecommit.models.GetDifferencesInput): F[avias.codecommit.models.GetDifferencesOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.GetDifferencesOutput, avias.codecommit.models.GetDifferencesInput](client, awsData, ServiceType, ServiceAndPrefix, "GetDifferences", POST, "/", input)
  override def deleteRepository(input: avias.codecommit.models.DeleteRepositoryInput): F[avias.codecommit.models.DeleteRepositoryOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.DeleteRepositoryOutput, avias.codecommit.models.DeleteRepositoryInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteRepository", POST, "/", input)
  override def deleteCommentContent(input: avias.codecommit.models.DeleteCommentContentInput): F[avias.codecommit.models.DeleteCommentContentOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.DeleteCommentContentOutput, avias.codecommit.models.DeleteCommentContentInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteCommentContent", POST, "/", input)
  override def getBlob(input: avias.codecommit.models.GetBlobInput): F[avias.codecommit.models.GetBlobOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.GetBlobOutput, avias.codecommit.models.GetBlobInput](client, awsData, ServiceType, ServiceAndPrefix, "GetBlob", POST, "/", input)
  override def getBranch(input: avias.codecommit.models.GetBranchInput): F[avias.codecommit.models.GetBranchOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.GetBranchOutput, avias.codecommit.models.GetBranchInput](client, awsData, ServiceType, ServiceAndPrefix, "GetBranch", POST, "/", input)
  override def getPullRequest(input: avias.codecommit.models.GetPullRequestInput): F[avias.codecommit.models.GetPullRequestOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.GetPullRequestOutput, avias.codecommit.models.GetPullRequestInput](client, awsData, ServiceType, ServiceAndPrefix, "GetPullRequest", POST, "/", input)
  override def describePullRequestEvents(input: avias.codecommit.models.DescribePullRequestEventsInput): F[avias.codecommit.models.DescribePullRequestEventsOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.DescribePullRequestEventsOutput, avias.codecommit.models.DescribePullRequestEventsInput](client, awsData, ServiceType, ServiceAndPrefix, "DescribePullRequestEvents", POST, "/", input)
  override def getComment(input: avias.codecommit.models.GetCommentInput): F[avias.codecommit.models.GetCommentOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.GetCommentOutput, avias.codecommit.models.GetCommentInput](client, awsData, ServiceType, ServiceAndPrefix, "GetComment", POST, "/", input)
  override def getRepositoryTriggers(input: avias.codecommit.models.GetRepositoryTriggersInput): F[avias.codecommit.models.GetRepositoryTriggersOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.GetRepositoryTriggersOutput, avias.codecommit.models.GetRepositoryTriggersInput](client, awsData, ServiceType, ServiceAndPrefix, "GetRepositoryTriggers", POST, "/", input)
  override def updatePullRequestTitle(input: avias.codecommit.models.UpdatePullRequestTitleInput): F[avias.codecommit.models.UpdatePullRequestTitleOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.UpdatePullRequestTitleOutput, avias.codecommit.models.UpdatePullRequestTitleInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdatePullRequestTitle", POST, "/", input)
  override def updateComment(input: avias.codecommit.models.UpdateCommentInput): F[avias.codecommit.models.UpdateCommentOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.UpdateCommentOutput, avias.codecommit.models.UpdateCommentInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateComment", POST, "/", input)
  override def postCommentReply(input: avias.codecommit.models.PostCommentReplyInput): F[avias.codecommit.models.PostCommentReplyOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.PostCommentReplyOutput, avias.codecommit.models.PostCommentReplyInput](client, awsData, ServiceType, ServiceAndPrefix, "PostCommentReply", POST, "/", input)
  override def getRepository(input: avias.codecommit.models.GetRepositoryInput): F[avias.codecommit.models.GetRepositoryOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.GetRepositoryOutput, avias.codecommit.models.GetRepositoryInput](client, awsData, ServiceType, ServiceAndPrefix, "GetRepository", POST, "/", input)
  override def createBranch(input: avias.codecommit.models.CreateBranchInput): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.codecommit.models.CreateBranchInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateBranch", POST, "/", input)
  override def updateRepositoryDescription(input: avias.codecommit.models.UpdateRepositoryDescriptionInput): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.codecommit.models.UpdateRepositoryDescriptionInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateRepositoryDescription", POST, "/", input)
  override def getCommentsForComparedCommit(input: avias.codecommit.models.GetCommentsForComparedCommitInput): F[avias.codecommit.models.GetCommentsForComparedCommitOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.GetCommentsForComparedCommitOutput, avias.codecommit.models.GetCommentsForComparedCommitInput](client, awsData, ServiceType, ServiceAndPrefix, "GetCommentsForComparedCommit", POST, "/", input)
  override def getMergeConflicts(input: avias.codecommit.models.GetMergeConflictsInput): F[avias.codecommit.models.GetMergeConflictsOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.GetMergeConflictsOutput, avias.codecommit.models.GetMergeConflictsInput](client, awsData, ServiceType, ServiceAndPrefix, "GetMergeConflicts", POST, "/", input)
  override def createRepository(input: avias.codecommit.models.CreateRepositoryInput): F[avias.codecommit.models.CreateRepositoryOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.CreateRepositoryOutput, avias.codecommit.models.CreateRepositoryInput](client, awsData, ServiceType, ServiceAndPrefix, "CreateRepository", POST, "/", input)
  override def listRepositories(input: avias.codecommit.models.ListRepositoriesInput): F[avias.codecommit.models.ListRepositoriesOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.ListRepositoriesOutput, avias.codecommit.models.ListRepositoriesInput](client, awsData, ServiceType, ServiceAndPrefix, "ListRepositories", POST, "/", input)
  override def getCommentsForPullRequest(input: avias.codecommit.models.GetCommentsForPullRequestInput): F[avias.codecommit.models.GetCommentsForPullRequestOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.GetCommentsForPullRequestOutput, avias.codecommit.models.GetCommentsForPullRequestInput](client, awsData, ServiceType, ServiceAndPrefix, "GetCommentsForPullRequest", POST, "/", input)
  override def putRepositoryTriggers(input: avias.codecommit.models.PutRepositoryTriggersInput): F[avias.codecommit.models.PutRepositoryTriggersOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.PutRepositoryTriggersOutput, avias.codecommit.models.PutRepositoryTriggersInput](client, awsData, ServiceType, ServiceAndPrefix, "PutRepositoryTriggers", POST, "/", input)
  override def listPullRequests(input: avias.codecommit.models.ListPullRequestsInput): F[avias.codecommit.models.ListPullRequestsOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.ListPullRequestsOutput, avias.codecommit.models.ListPullRequestsInput](client, awsData, ServiceType, ServiceAndPrefix, "ListPullRequests", POST, "/", input)
  override def createPullRequest(input: avias.codecommit.models.CreatePullRequestInput): F[avias.codecommit.models.CreatePullRequestOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.CreatePullRequestOutput, avias.codecommit.models.CreatePullRequestInput](client, awsData, ServiceType, ServiceAndPrefix, "CreatePullRequest", POST, "/", input)
  override def updatePullRequestDescription(input: avias.codecommit.models.UpdatePullRequestDescriptionInput): F[avias.codecommit.models.UpdatePullRequestDescriptionOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.UpdatePullRequestDescriptionOutput, avias.codecommit.models.UpdatePullRequestDescriptionInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdatePullRequestDescription", POST, "/", input)
  override def postCommentForPullRequest(input: avias.codecommit.models.PostCommentForPullRequestInput): F[avias.codecommit.models.PostCommentForPullRequestOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.PostCommentForPullRequestOutput, avias.codecommit.models.PostCommentForPullRequestInput](client, awsData, ServiceType, ServiceAndPrefix, "PostCommentForPullRequest", POST, "/", input)
  override def getCommit(input: avias.codecommit.models.GetCommitInput): F[avias.codecommit.models.GetCommitOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.GetCommitOutput, avias.codecommit.models.GetCommitInput](client, awsData, ServiceType, ServiceAndPrefix, "GetCommit", POST, "/", input)
  override def testRepositoryTriggers(input: avias.codecommit.models.TestRepositoryTriggersInput): F[avias.codecommit.models.TestRepositoryTriggersOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.TestRepositoryTriggersOutput, avias.codecommit.models.TestRepositoryTriggersInput](client, awsData, ServiceType, ServiceAndPrefix, "TestRepositoryTriggers", POST, "/", input)
  override def batchGetRepositories(input: avias.codecommit.models.BatchGetRepositoriesInput): F[avias.codecommit.models.BatchGetRepositoriesOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.BatchGetRepositoriesOutput, avias.codecommit.models.BatchGetRepositoriesInput](client, awsData, ServiceType, ServiceAndPrefix, "BatchGetRepositories", POST, "/", input)
  override def updateRepositoryName(input: avias.codecommit.models.UpdateRepositoryNameInput): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.codecommit.models.UpdateRepositoryNameInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateRepositoryName", POST, "/", input)
  override def mergePullRequestByFastForward(input: avias.codecommit.models.MergePullRequestByFastForwardInput): F[avias.codecommit.models.MergePullRequestByFastForwardOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.MergePullRequestByFastForwardOutput, avias.codecommit.models.MergePullRequestByFastForwardInput](client, awsData, ServiceType, ServiceAndPrefix, "MergePullRequestByFastForward", POST, "/", input)
  override def postCommentForComparedCommit(input: avias.codecommit.models.PostCommentForComparedCommitInput): F[avias.codecommit.models.PostCommentForComparedCommitOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.PostCommentForComparedCommitOutput, avias.codecommit.models.PostCommentForComparedCommitInput](client, awsData, ServiceType, ServiceAndPrefix, "PostCommentForComparedCommit", POST, "/", input)
  override def updatePullRequestStatus(input: avias.codecommit.models.UpdatePullRequestStatusInput): F[avias.codecommit.models.UpdatePullRequestStatusOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.UpdatePullRequestStatusOutput, avias.codecommit.models.UpdatePullRequestStatusInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdatePullRequestStatus", POST, "/", input)
  override def deleteBranch(input: avias.codecommit.models.DeleteBranchInput): F[avias.codecommit.models.DeleteBranchOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.DeleteBranchOutput, avias.codecommit.models.DeleteBranchInput](client, awsData, ServiceType, ServiceAndPrefix, "DeleteBranch", POST, "/", input)
  override def listBranches(input: avias.codecommit.models.ListBranchesInput): F[avias.codecommit.models.ListBranchesOutput] = avias.common.http4s.ClientUtils.doRequest[F, avias.codecommit.models.ListBranchesOutput, avias.codecommit.models.ListBranchesInput](client, awsData, ServiceType, ServiceAndPrefix, "ListBranches", POST, "/", input)
  override def updateDefaultBranch(input: avias.codecommit.models.UpdateDefaultBranchInput): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.codecommit.models.UpdateDefaultBranchInput](client, awsData, ServiceType, ServiceAndPrefix, "UpdateDefaultBranch", POST, "/", input)
}