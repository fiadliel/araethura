package avias.workspaces.models
case object DeleteTagsResult
final case class RebootWorkspacesResult(failedRequests: scala.Option[scala.List[avias.workspaces.models.FailedWorkspaceChangeRequest]] = scala.None)
final case class DescribeWorkspacesRequest(userName: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None, limit: scala.Option[scala.Int] = scala.None, workspaceIds: scala.Option[scala.List[java.lang.String]] = scala.None, bundleId: scala.Option[java.lang.String] = scala.None, directoryId: scala.Option[java.lang.String] = scala.None)
final case class WorkspaceDirectory(customerUserName: scala.Option[java.lang.String] = scala.None, directoryName: scala.Option[java.lang.String] = scala.None, dnsIpAddresses: scala.Option[scala.List[java.lang.String]] = scala.None, subnetIds: scala.Option[scala.List[java.lang.String]] = scala.None, state: scala.Option[java.lang.String] = scala.None, workspaceCreationProperties: scala.Option[avias.workspaces.models.DefaultWorkspaceCreationProperties] = scala.None, workspaceSecurityGroupId: scala.Option[java.lang.String] = scala.None, alias: scala.Option[java.lang.String] = scala.None, iamRoleId: scala.Option[java.lang.String] = scala.None, registrationCode: scala.Option[java.lang.String] = scala.None, directoryType: scala.Option[java.lang.String] = scala.None, directoryId: scala.Option[java.lang.String] = scala.None)
final case class TerminateWorkspacesRequest(terminateWorkspaceRequests: scala.List[avias.workspaces.models.TerminateRequest])
final case class WorkspaceBundle(name: scala.Option[java.lang.String] = scala.None, computeType: scala.Option[avias.workspaces.models.ComputeType] = scala.None, userStorage: scala.Option[avias.workspaces.models.UserStorage] = scala.None, owner: scala.Option[java.lang.String] = scala.None, description: scala.Option[java.lang.String] = scala.None, bundleId: scala.Option[java.lang.String] = scala.None)
final case class RebootWorkspacesRequest(rebootWorkspaceRequests: scala.List[avias.workspaces.models.RebootRequest])
final case class ModifyWorkspacePropertiesRequest(workspaceId: java.lang.String, workspaceProperties: avias.workspaces.models.WorkspaceProperties)
final case class Workspace(computerName: scala.Option[java.lang.String] = scala.None, workspaceId: scala.Option[java.lang.String] = scala.None, userName: scala.Option[java.lang.String] = scala.None, subnetId: scala.Option[java.lang.String] = scala.None, volumeEncryptionKey: scala.Option[java.lang.String] = scala.None, userVolumeEncryptionEnabled: scala.Option[scala.Boolean] = scala.None, rootVolumeEncryptionEnabled: scala.Option[scala.Boolean] = scala.None, state: scala.Option[java.lang.String] = scala.None, errorMessage: scala.Option[java.lang.String] = scala.None, errorCode: scala.Option[java.lang.String] = scala.None, bundleId: scala.Option[java.lang.String] = scala.None, workspaceProperties: scala.Option[avias.workspaces.models.WorkspaceProperties] = scala.None, directoryId: scala.Option[java.lang.String] = scala.None, ipAddress: scala.Option[java.lang.String] = scala.None)
final case class FailedCreateWorkspaceRequest(workspaceRequest: scala.Option[avias.workspaces.models.WorkspaceRequest] = scala.None, errorCode: scala.Option[java.lang.String] = scala.None, errorMessage: scala.Option[java.lang.String] = scala.None)
final case class DescribeTagsResult(tagList: scala.Option[scala.List[avias.workspaces.models.Tag]] = scala.None)
final case class StartWorkspacesRequest(startWorkspaceRequests: scala.List[avias.workspaces.models.StartRequest])
final case class ComputeType(name: scala.Option[java.lang.String] = scala.None)
final case class UserStorage(capacity: scala.Option[java.lang.String] = scala.None)
final case class CreateWorkspacesResult(failedRequests: scala.Option[scala.List[avias.workspaces.models.FailedCreateWorkspaceRequest]] = scala.None, pendingRequests: scala.Option[scala.List[avias.workspaces.models.Workspace]] = scala.None)
final case class UnsupportedWorkspaceConfigurationException(message: scala.Option[java.lang.String] = scala.None)
final case class AccessDeniedException(message: scala.Option[java.lang.String] = scala.None)
final case class DescribeWorkspaceBundlesRequest(bundleIds: scala.Option[scala.List[java.lang.String]] = scala.None, owner: scala.Option[java.lang.String] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class DescribeWorkspacesConnectionStatusResult(workspacesConnectionStatus: scala.Option[scala.List[avias.workspaces.models.WorkspaceConnectionStatus]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class RebootRequest(workspaceId: java.lang.String)
final case class DescribeTagsRequest(resourceId: java.lang.String)
final case class Tag(key: java.lang.String, value: scala.Option[java.lang.String] = scala.None)
final case class TerminateRequest(workspaceId: java.lang.String)
final case class RebuildWorkspacesRequest(rebuildWorkspaceRequests: scala.List[avias.workspaces.models.RebuildRequest])
final case class CreateTagsRequest(resourceId: java.lang.String, tags: scala.List[avias.workspaces.models.Tag])
final case class DescribeWorkspaceDirectoriesResult(directories: scala.Option[scala.List[avias.workspaces.models.WorkspaceDirectory]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class ResourceNotFoundException(message: scala.Option[java.lang.String] = scala.None, resourceId: scala.Option[java.lang.String] = scala.None)
final case class StartWorkspacesResult(failedRequests: scala.Option[scala.List[avias.workspaces.models.FailedWorkspaceChangeRequest]] = scala.None)
case object ModifyWorkspacePropertiesResult
final case class DescribeWorkspacesResult(workspaces: scala.Option[scala.List[avias.workspaces.models.Workspace]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class InvalidResourceStateException(message: scala.Option[java.lang.String] = scala.None)
final case class RebuildWorkspacesResult(failedRequests: scala.Option[scala.List[avias.workspaces.models.FailedWorkspaceChangeRequest]] = scala.None)
final case class DefaultWorkspaceCreationProperties(enableWorkDocs: scala.Option[scala.Boolean] = scala.None, enableInternetAccess: scala.Option[scala.Boolean] = scala.None, userEnabledAsLocalAdministrator: scala.Option[scala.Boolean] = scala.None, defaultOu: scala.Option[java.lang.String] = scala.None, customSecurityGroupId: scala.Option[java.lang.String] = scala.None)
final case class FailedWorkspaceChangeRequest(workspaceId: scala.Option[java.lang.String] = scala.None, errorCode: scala.Option[java.lang.String] = scala.None, errorMessage: scala.Option[java.lang.String] = scala.None)
final case class WorkspaceConnectionStatus(workspaceId: scala.Option[java.lang.String] = scala.None, connectionState: scala.Option[java.lang.String] = scala.None, connectionStateCheckTimestamp: scala.Option[java.time.Instant] = scala.None, lastKnownUserConnectionTimestamp: scala.Option[java.time.Instant] = scala.None)
final case class ResourceUnavailableException(message: scala.Option[java.lang.String] = scala.None, resourceId: scala.Option[java.lang.String] = scala.None)
final case class StopRequest(workspaceId: scala.Option[java.lang.String] = scala.None)
final case class OperationInProgressException(message: scala.Option[java.lang.String] = scala.None)
final case class StopWorkspacesResult(failedRequests: scala.Option[scala.List[avias.workspaces.models.FailedWorkspaceChangeRequest]] = scala.None)
final case class TerminateWorkspacesResult(failedRequests: scala.Option[scala.List[avias.workspaces.models.FailedWorkspaceChangeRequest]] = scala.None)
final case class StopWorkspacesRequest(stopWorkspaceRequests: scala.List[avias.workspaces.models.StopRequest])
final case class RebuildRequest(workspaceId: java.lang.String)
final case class DescribeWorkspaceBundlesResult(bundles: scala.Option[scala.List[avias.workspaces.models.WorkspaceBundle]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
final case class CreateWorkspacesRequest(workspaces: scala.List[avias.workspaces.models.WorkspaceRequest])
final case class ResourceLimitExceededException(message: scala.Option[java.lang.String] = scala.None)
final case class InvalidParameterValuesException(message: scala.Option[java.lang.String] = scala.None)
final case class DescribeWorkspaceDirectoriesRequest(directoryIds: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)
case object CreateTagsResult
final case class WorkspaceProperties(runningMode: scala.Option[java.lang.String] = scala.None, runningModeAutoStopTimeoutInMinutes: scala.Option[scala.Int] = scala.None)
final case class WorkspaceRequest(userName: java.lang.String, bundleId: java.lang.String, directoryId: java.lang.String, volumeEncryptionKey: scala.Option[java.lang.String] = scala.None, tags: scala.Option[scala.List[avias.workspaces.models.Tag]] = scala.None, userVolumeEncryptionEnabled: scala.Option[scala.Boolean] = scala.None, rootVolumeEncryptionEnabled: scala.Option[scala.Boolean] = scala.None, workspaceProperties: scala.Option[avias.workspaces.models.WorkspaceProperties] = scala.None)
final case class DeleteTagsRequest(resourceId: java.lang.String, tagKeys: scala.List[java.lang.String])
final case class StartRequest(workspaceId: scala.Option[java.lang.String] = scala.None)
final case class DescribeWorkspacesConnectionStatusRequest(workspaceIds: scala.Option[scala.List[java.lang.String]] = scala.None, nextToken: scala.Option[java.lang.String] = scala.None)