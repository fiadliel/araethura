package org.lyranthe.araethura.opsworks
trait Amazonopsworks[F[_]] {
  def describeElasticIps(input: models.DescribeElasticIpsRequest): F[models.DescribeElasticIpsResult]
  def untagResource(input: models.UntagResourceRequest): F[Unit]
  def setTimeBasedAutoScaling(input: models.SetTimeBasedAutoScalingRequest): F[Unit]
  def describeInstances(input: models.DescribeInstancesRequest): F[models.DescribeInstancesResult]
  def describeRaidArrays(input: models.DescribeRaidArraysRequest): F[models.DescribeRaidArraysResult]
  def unassignVolume(input: models.UnassignVolumeRequest): F[Unit]
  def deleteUserProfile(input: models.DeleteUserProfileRequest): F[Unit]
  def setPermission(input: models.SetPermissionRequest): F[Unit]
  def updateElasticIp(input: models.UpdateElasticIpRequest): F[Unit]
  def describeApps(input: models.DescribeAppsRequest): F[models.DescribeAppsResult]
  def deregisterInstance(input: models.DeregisterInstanceRequest): F[Unit]
  def disassociateElasticIp(input: models.DisassociateElasticIpRequest): F[Unit]
  def deregisterVolume(input: models.DeregisterVolumeRequest): F[Unit]
  def updateStack(input: models.UpdateStackRequest): F[Unit]
  def deleteInstance(input: models.DeleteInstanceRequest): F[Unit]
  def deregisterRdsDbInstance(input: models.DeregisterRdsDbInstanceRequest): F[Unit]
  def describeMyUserProfile: F[models.DescribeMyUserProfileResult]
  def describeAgentVersions(input: models.DescribeAgentVersionsRequest): F[models.DescribeAgentVersionsResult]
  def deregisterElasticIp(input: models.DeregisterElasticIpRequest): F[Unit]
  def describePermissions(input: models.DescribePermissionsRequest): F[models.DescribePermissionsResult]
  def describeUserProfiles(input: models.DescribeUserProfilesRequest): F[models.DescribeUserProfilesResult]
  def rebootInstance(input: models.RebootInstanceRequest): F[Unit]
  def updateUserProfile(input: models.UpdateUserProfileRequest): F[Unit]
  def startInstance(input: models.StartInstanceRequest): F[Unit]
  def tagResource(input: models.TagResourceRequest): F[Unit]
  def stopInstance(input: models.StopInstanceRequest): F[Unit]
  def describeServiceErrors(input: models.DescribeServiceErrorsRequest): F[models.DescribeServiceErrorsResult]
  def describeVolumes(input: models.DescribeVolumesRequest): F[models.DescribeVolumesResult]
  def assignInstance(input: models.AssignInstanceRequest): F[Unit]
  def attachElasticLoadBalancer(input: models.AttachElasticLoadBalancerRequest): F[Unit]
  def createUserProfile(input: models.CreateUserProfileRequest): F[models.CreateUserProfileResult]
  def describeElasticLoadBalancers(input: models.DescribeElasticLoadBalancersRequest): F[models.DescribeElasticLoadBalancersResult]
  def describeCommands(input: models.DescribeCommandsRequest): F[models.DescribeCommandsResult]
  def deleteStack(input: models.DeleteStackRequest): F[Unit]
  def registerInstance(input: models.RegisterInstanceRequest): F[models.RegisterInstanceResult]
  def registerEcsCluster(input: models.RegisterEcsClusterRequest): F[models.RegisterEcsClusterResult]
  def associateElasticIp(input: models.AssociateElasticIpRequest): F[Unit]
  def updateRdsDbInstance(input: models.UpdateRdsDbInstanceRequest): F[Unit]
  def detachElasticLoadBalancer(input: models.DetachElasticLoadBalancerRequest): F[Unit]
  def deleteApp(input: models.DeleteAppRequest): F[Unit]
  def deregisterEcsCluster(input: models.DeregisterEcsClusterRequest): F[Unit]
  def createDeployment(input: models.CreateDeploymentRequest): F[models.CreateDeploymentResult]
  def describeStackSummary(input: models.DescribeStackSummaryRequest): F[models.DescribeStackSummaryResult]
  def listTags(input: models.ListTagsRequest): F[models.ListTagsResult]
  def deleteLayer(input: models.DeleteLayerRequest): F[Unit]
  def getHostnameSuggestion(input: models.GetHostnameSuggestionRequest): F[models.GetHostnameSuggestionResult]
  def createInstance(input: models.CreateInstanceRequest): F[models.CreateInstanceResult]
  def registerVolume(input: models.RegisterVolumeRequest): F[models.RegisterVolumeResult]
  def stopStack(input: models.StopStackRequest): F[Unit]
  def describeLayers(input: models.DescribeLayersRequest): F[models.DescribeLayersResult]
  def createApp(input: models.CreateAppRequest): F[models.CreateAppResult]
  def describeStackProvisioningParameters(input: models.DescribeStackProvisioningParametersRequest): F[models.DescribeStackProvisioningParametersResult]
  def unassignInstance(input: models.UnassignInstanceRequest): F[Unit]
  def assignVolume(input: models.AssignVolumeRequest): F[Unit]
  def grantAccess(input: models.GrantAccessRequest): F[models.GrantAccessResult]
  def cloneStack(input: models.CloneStackRequest): F[models.CloneStackResult]
  def describeTimeBasedAutoScaling(input: models.DescribeTimeBasedAutoScalingRequest): F[models.DescribeTimeBasedAutoScalingResult]
  def describeRdsDbInstances(input: models.DescribeRdsDbInstancesRequest): F[models.DescribeRdsDbInstancesResult]
  def updateApp(input: models.UpdateAppRequest): F[Unit]
  def updateMyUserProfile(input: models.UpdateMyUserProfileRequest): F[Unit]
  def describeEcsClusters(input: models.DescribeEcsClustersRequest): F[models.DescribeEcsClustersResult]
  def updateLayer(input: models.UpdateLayerRequest): F[Unit]
  def registerRdsDbInstance(input: models.RegisterRdsDbInstanceRequest): F[Unit]
  def updateInstance(input: models.UpdateInstanceRequest): F[Unit]
  def describeStacks(input: models.DescribeStacksRequest): F[models.DescribeStacksResult]
  def setLoadBasedAutoScaling(input: models.SetLoadBasedAutoScalingRequest): F[Unit]
  def startStack(input: models.StartStackRequest): F[Unit]
  def describeLoadBasedAutoScaling(input: models.DescribeLoadBasedAutoScalingRequest): F[models.DescribeLoadBasedAutoScalingResult]
  def createLayer(input: models.CreateLayerRequest): F[models.CreateLayerResult]
  def updateVolume(input: models.UpdateVolumeRequest): F[Unit]
  def createStack(input: models.CreateStackRequest): F[models.CreateStackResult]
  def describeDeployments(input: models.DescribeDeploymentsRequest): F[models.DescribeDeploymentsResult]
  def registerElasticIp(input: models.RegisterElasticIpRequest): F[models.RegisterElasticIpResult]
}