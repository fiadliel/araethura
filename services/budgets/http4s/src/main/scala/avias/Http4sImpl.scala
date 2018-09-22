package avias.budgets.http4s
import org.http4s.Method._
import avias.budgets.circe._
import avias.budgets.models
import avias.common.http4s.ClientUtils._
class AmazonbudgetsClient[F[_]: cats.effect.Sync](client: org.http4s.client.Client[F], awsData: avias.common.AwsData[F]) extends avias.budgets.Amazonbudgets[F] {
  private[this] final val ServiceType: String = "budgets"
  private[this] final val ServiceAndPrefix: Option[String] = Some("AWSBudgetServiceGateway")
  override def describeSubscribersForNotification(input: avias.budgets.models.DescribeSubscribersForNotificationRequest): F[avias.budgets.models.DescribeSubscribersForNotificationResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.budgets.models.DescribeSubscribersForNotificationResponse, avias.budgets.models.DescribeSubscribersForNotificationRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeSubscribersForNotification", POST, "/", input)
  override def createSubscriber(input: avias.budgets.models.CreateSubscriberRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.budgets.models.CreateSubscriberRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateSubscriber", POST, "/", input)
  override def deleteSubscriber(input: avias.budgets.models.DeleteSubscriberRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.budgets.models.DeleteSubscriberRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteSubscriber", POST, "/", input)
  override def createBudget(input: avias.budgets.models.CreateBudgetRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.budgets.models.CreateBudgetRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateBudget", POST, "/", input)
  override def describeBudget(input: avias.budgets.models.DescribeBudgetRequest): F[avias.budgets.models.DescribeBudgetResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.budgets.models.DescribeBudgetResponse, avias.budgets.models.DescribeBudgetRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeBudget", POST, "/", input)
  override def deleteBudget(input: avias.budgets.models.DeleteBudgetRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.budgets.models.DeleteBudgetRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteBudget", POST, "/", input)
  override def updateSubscriber(input: avias.budgets.models.UpdateSubscriberRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.budgets.models.UpdateSubscriberRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateSubscriber", POST, "/", input)
  override def describeNotificationsForBudget(input: avias.budgets.models.DescribeNotificationsForBudgetRequest): F[avias.budgets.models.DescribeNotificationsForBudgetResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.budgets.models.DescribeNotificationsForBudgetResponse, avias.budgets.models.DescribeNotificationsForBudgetRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeNotificationsForBudget", POST, "/", input)
  override def describeBudgets(input: avias.budgets.models.DescribeBudgetsRequest): F[avias.budgets.models.DescribeBudgetsResponse] = avias.common.http4s.ClientUtils.doRequest[F, avias.budgets.models.DescribeBudgetsResponse, avias.budgets.models.DescribeBudgetsRequest](client, awsData, ServiceType, ServiceAndPrefix, "DescribeBudgets", POST, "/", input)
  override def updateBudget(input: avias.budgets.models.UpdateBudgetRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.budgets.models.UpdateBudgetRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateBudget", POST, "/", input)
  override def deleteNotification(input: avias.budgets.models.DeleteNotificationRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.budgets.models.DeleteNotificationRequest](client, awsData, ServiceType, ServiceAndPrefix, "DeleteNotification", POST, "/", input)
  override def createNotification(input: avias.budgets.models.CreateNotificationRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.budgets.models.CreateNotificationRequest](client, awsData, ServiceType, ServiceAndPrefix, "CreateNotification", POST, "/", input)
  override def updateNotification(input: avias.budgets.models.UpdateNotificationRequest): F[scala.Unit] = avias.common.http4s.ClientUtils.doRequest[F, scala.Unit, avias.budgets.models.UpdateNotificationRequest](client, awsData, ServiceType, ServiceAndPrefix, "UpdateNotification", POST, "/", input)
}