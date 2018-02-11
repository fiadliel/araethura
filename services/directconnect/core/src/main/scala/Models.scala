package org.lyranthe.araethura.directconnect.models
import org.lyranthe.araethura.directconnect.models
final case class DisassociateConnectionFromLagRequest(connectionId: java.lang.String, lagId: java.lang.String)
final case class ResourceTag(resourceArn: scala.Option[java.lang.String] = None, tags: scala.Option[scala.List[models.Tag]] = None)
final case class Connections(connections: scala.Option[scala.List[models.Connection]] = None)
final case class DeleteDirectConnectGatewayAssociationResult(directConnectGatewayAssociation: scala.Option[models.DirectConnectGatewayAssociation] = None)
final case class NewPrivateVirtualInterfaceAllocation(asn: scala.Int, virtualInterfaceName: java.lang.String, vlan: scala.Int, customerAddress: scala.Option[java.lang.String] = None, amazonAddress: scala.Option[java.lang.String] = None, addressFamily: scala.Option[java.lang.String] = None, authKey: scala.Option[java.lang.String] = None)
final case class DescribeConnectionLoaResponse(loa: scala.Option[models.Loa] = None)
final case class DescribeConnectionsOnInterconnectRequest(interconnectId: java.lang.String)
final case class DeleteBGPPeerResponse(virtualInterface: scala.Option[models.VirtualInterface] = None)
final case class CreateLagRequest(lagName: java.lang.String, connectionsBandwidth: java.lang.String, location: java.lang.String, numberOfConnections: scala.Int, connectionId: scala.Option[java.lang.String] = None)
final case class DeleteVirtualInterfaceResponse(virtualInterfaceState: scala.Option[java.lang.String] = None)
final case class Interconnect(awsDevice: scala.Option[java.lang.String] = None, interconnectName: scala.Option[java.lang.String] = None, region: scala.Option[java.lang.String] = None, loaIssueTime: scala.Option[java.time.Instant] = None, interconnectId: scala.Option[java.lang.String] = None, lagId: scala.Option[java.lang.String] = None, interconnectState: scala.Option[java.lang.String] = None, bandwidth: scala.Option[java.lang.String] = None, location: scala.Option[java.lang.String] = None)
final case class DirectConnectGatewayAssociation(directConnectGatewayId: scala.Option[java.lang.String] = None, virtualGatewayOwnerAccount: scala.Option[java.lang.String] = None, virtualGatewayRegion: scala.Option[java.lang.String] = None, associationState: scala.Option[java.lang.String] = None, stateChangeError: scala.Option[java.lang.String] = None, virtualGatewayId: scala.Option[java.lang.String] = None)
final case class DeleteDirectConnectGatewayResult(directConnectGateway: scala.Option[models.DirectConnectGateway] = None)
final case class Connection(awsDevice: scala.Option[java.lang.String] = None, connectionId: scala.Option[java.lang.String] = None, ownerAccount: scala.Option[java.lang.String] = None, region: scala.Option[java.lang.String] = None, partnerName: scala.Option[java.lang.String] = None, loaIssueTime: scala.Option[java.time.Instant] = None, lagId: scala.Option[java.lang.String] = None, connectionName: scala.Option[java.lang.String] = None, vlan: scala.Option[scala.Int] = None, bandwidth: scala.Option[java.lang.String] = None, location: scala.Option[java.lang.String] = None, connectionState: scala.Option[java.lang.String] = None)
final case class AllocateConnectionOnInterconnectRequest(ownerAccount: java.lang.String, interconnectId: java.lang.String, connectionName: java.lang.String, vlan: scala.Int, bandwidth: java.lang.String)
final case class DescribeDirectConnectGatewayAttachmentsRequest(directConnectGatewayId: scala.Option[java.lang.String] = None, virtualInterfaceId: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
final case class CreateBGPPeerResponse(virtualInterface: scala.Option[models.VirtualInterface] = None)
final case class TagResourceRequest(resourceArn: java.lang.String, tags: scala.List[models.Tag])
final case class AllocatePublicVirtualInterfaceRequest(connectionId: java.lang.String, ownerAccount: java.lang.String, newPublicVirtualInterfaceAllocation: models.NewPublicVirtualInterfaceAllocation)
final case class AssociateHostedConnectionRequest(connectionId: java.lang.String, parentConnectionId: java.lang.String)
final case class DescribeInterconnectLoaRequest(interconnectId: java.lang.String, providerName: scala.Option[java.lang.String] = None, loaContentType: scala.Option[java.lang.String] = None)
final case class DeleteBGPPeerRequest(virtualInterfaceId: scala.Option[java.lang.String] = None, asn: scala.Option[scala.Int] = None, customerAddress: scala.Option[java.lang.String] = None)
final case class ConfirmPrivateVirtualInterfaceRequest(virtualInterfaceId: java.lang.String, virtualGatewayId: scala.Option[java.lang.String] = None, directConnectGatewayId: scala.Option[java.lang.String] = None)
final case class DeleteInterconnectRequest(interconnectId: java.lang.String)
final case class ConfirmPrivateVirtualInterfaceResponse(virtualInterfaceState: scala.Option[java.lang.String] = None)
final case class CreateConnectionRequest(location: java.lang.String, bandwidth: java.lang.String, connectionName: java.lang.String, lagId: scala.Option[java.lang.String] = None)
final case class Location(locationCode: scala.Option[java.lang.String] = None, locationName: scala.Option[java.lang.String] = None)
final case class CreateBGPPeerRequest(virtualInterfaceId: scala.Option[java.lang.String] = None, newBGPPeer: scala.Option[models.NewBGPPeer] = None)
final case class UntagResourceRequest(resourceArn: java.lang.String, tagKeys: scala.List[java.lang.String])
final case class DescribeConnectionLoaRequest(connectionId: java.lang.String, providerName: scala.Option[java.lang.String] = None, loaContentType: scala.Option[java.lang.String] = None)
final case class Tag(key: java.lang.String, value: scala.Option[java.lang.String] = None)
final case class AllocateHostedConnectionRequest(connectionId: java.lang.String, ownerAccount: java.lang.String, connectionName: java.lang.String, vlan: scala.Int, bandwidth: java.lang.String)
final case class DescribeLagsRequest(lagId: scala.Option[java.lang.String] = None)
final case class DescribeConnectionsRequest(connectionId: scala.Option[java.lang.String] = None)
final case class NewPublicVirtualInterface(asn: scala.Int, virtualInterfaceName: java.lang.String, vlan: scala.Int, customerAddress: scala.Option[java.lang.String] = None, amazonAddress: scala.Option[java.lang.String] = None, addressFamily: scala.Option[java.lang.String] = None, routeFilterPrefixes: scala.Option[scala.List[models.RouteFilterPrefix]] = None, authKey: scala.Option[java.lang.String] = None)
final case class DescribeDirectConnectGatewaysRequest(directConnectGatewayId: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
final case class AssociateConnectionWithLagRequest(connectionId: java.lang.String, lagId: java.lang.String)
final case class CreateDirectConnectGatewayAssociationRequest(directConnectGatewayId: java.lang.String, virtualGatewayId: java.lang.String)
final case class RouteFilterPrefix(cidr: scala.Option[java.lang.String] = None)
final case class DirectConnectServerException(message: scala.Option[java.lang.String] = None)
final case class NewBGPPeer(customerAddress: scala.Option[java.lang.String] = None, amazonAddress: scala.Option[java.lang.String] = None, addressFamily: scala.Option[java.lang.String] = None, asn: scala.Option[scala.Int] = None, authKey: scala.Option[java.lang.String] = None)
final case class DescribeHostedConnectionsRequest(connectionId: java.lang.String)
final case class AssociateVirtualInterfaceRequest(virtualInterfaceId: java.lang.String, connectionId: java.lang.String)
final case class DescribeLoaRequest(connectionId: java.lang.String, providerName: scala.Option[java.lang.String] = None, loaContentType: scala.Option[java.lang.String] = None)
final case class UpdateLagRequest(lagId: java.lang.String, lagName: scala.Option[java.lang.String] = None, minimumLinks: scala.Option[scala.Int] = None)
final case class CreateDirectConnectGatewayAssociationResult(directConnectGatewayAssociation: scala.Option[models.DirectConnectGatewayAssociation] = None)
final case class VirtualGateways(virtualGateways: scala.Option[scala.List[models.VirtualGateway]] = None)
final case class DeleteInterconnectResponse(interconnectState: scala.Option[java.lang.String] = None)
final case class DescribeDirectConnectGatewayAssociationsRequest(directConnectGatewayId: scala.Option[java.lang.String] = None, virtualGatewayId: scala.Option[java.lang.String] = None, maxResults: scala.Option[scala.Int] = None, nextToken: scala.Option[java.lang.String] = None)
final case class VirtualGateway(virtualGatewayId: scala.Option[java.lang.String] = None, virtualGatewayState: scala.Option[java.lang.String] = None)
final case class Interconnects(interconnects: scala.Option[scala.List[models.Interconnect]] = None)
case object DuplicateTagKeysException
final case class DescribeTagsRequest(resourceArns: scala.List[java.lang.String])
final case class DeleteDirectConnectGatewayAssociationRequest(directConnectGatewayId: java.lang.String, virtualGatewayId: java.lang.String)
final case class CreatePrivateVirtualInterfaceRequest(connectionId: java.lang.String, newPrivateVirtualInterface: models.NewPrivateVirtualInterface)
final case class Lag(awsDevice: scala.Option[java.lang.String] = None, lagState: scala.Option[java.lang.String] = None, lagName: scala.Option[java.lang.String] = None, ownerAccount: scala.Option[java.lang.String] = None, region: scala.Option[java.lang.String] = None, allowsHostedConnections: scala.Option[scala.Boolean] = None, lagId: scala.Option[java.lang.String] = None, connectionsBandwidth: scala.Option[java.lang.String] = None, location: scala.Option[java.lang.String] = None, connections: scala.Option[scala.List[models.Connection]] = None, numberOfConnections: scala.Option[scala.Int] = None, minimumLinks: scala.Option[scala.Int] = None)
final case class ConfirmConnectionRequest(connectionId: java.lang.String)
case object TooManyTagsException
final case class DescribeVirtualInterfacesRequest(connectionId: scala.Option[java.lang.String] = None, virtualInterfaceId: scala.Option[java.lang.String] = None)
case object TagResourceResponse
case object UntagResourceResponse
final case class Loa(loaContent: scala.Option[scala.Array[scala.Byte]] = None, loaContentType: scala.Option[java.lang.String] = None)
final case class ConfirmPublicVirtualInterfaceResponse(virtualInterfaceState: scala.Option[java.lang.String] = None)
final case class ConfirmPublicVirtualInterfaceRequest(virtualInterfaceId: java.lang.String)
final case class CreateDirectConnectGatewayRequest(directConnectGatewayName: java.lang.String, amazonSideAsn: scala.Option[scala.Long] = None)
final case class NewPublicVirtualInterfaceAllocation(asn: scala.Int, virtualInterfaceName: java.lang.String, vlan: scala.Int, customerAddress: scala.Option[java.lang.String] = None, amazonAddress: scala.Option[java.lang.String] = None, addressFamily: scala.Option[java.lang.String] = None, routeFilterPrefixes: scala.Option[scala.List[models.RouteFilterPrefix]] = None, authKey: scala.Option[java.lang.String] = None)
final case class DeleteVirtualInterfaceRequest(virtualInterfaceId: java.lang.String)
final case class DescribeDirectConnectGatewayAssociationsResult(directConnectGatewayAssociations: scala.Option[scala.List[models.DirectConnectGatewayAssociation]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class DescribeInterconnectsRequest(interconnectId: scala.Option[java.lang.String] = None)
final case class BGPPeer(customerAddress: scala.Option[java.lang.String] = None, amazonAddress: scala.Option[java.lang.String] = None, addressFamily: scala.Option[java.lang.String] = None, asn: scala.Option[scala.Int] = None, bgpStatus: scala.Option[java.lang.String] = None, bgpPeerState: scala.Option[java.lang.String] = None, authKey: scala.Option[java.lang.String] = None)
final case class ConfirmConnectionResponse(connectionState: scala.Option[java.lang.String] = None)
final case class DescribeDirectConnectGatewayAttachmentsResult(directConnectGatewayAttachments: scala.Option[scala.List[models.DirectConnectGatewayAttachment]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class VirtualInterfaces(virtualInterfaces: scala.Option[scala.List[models.VirtualInterface]] = None)
final case class CreateDirectConnectGatewayResult(directConnectGateway: scala.Option[models.DirectConnectGateway] = None)
final case class CreatePublicVirtualInterfaceRequest(connectionId: java.lang.String, newPublicVirtualInterface: models.NewPublicVirtualInterface)
final case class DeleteLagRequest(lagId: java.lang.String)
final case class DescribeDirectConnectGatewaysResult(directConnectGateways: scala.Option[scala.List[models.DirectConnectGateway]] = None, nextToken: scala.Option[java.lang.String] = None)
final case class DescribeTagsResponse(resourceTags: scala.Option[scala.List[models.ResourceTag]] = None)
final case class DescribeInterconnectLoaResponse(loa: scala.Option[models.Loa] = None)
final case class NewPrivateVirtualInterface(asn: scala.Int, virtualInterfaceName: java.lang.String, vlan: scala.Int, customerAddress: scala.Option[java.lang.String] = None, amazonAddress: scala.Option[java.lang.String] = None, directConnectGatewayId: scala.Option[java.lang.String] = None, addressFamily: scala.Option[java.lang.String] = None, authKey: scala.Option[java.lang.String] = None, virtualGatewayId: scala.Option[java.lang.String] = None)
final case class Locations(locations: scala.Option[scala.List[models.Location]] = None)
final case class VirtualInterface(customerAddress: scala.Option[java.lang.String] = None, connectionId: scala.Option[java.lang.String] = None, virtualInterfaceType: scala.Option[java.lang.String] = None, amazonAddress: scala.Option[java.lang.String] = None, virtualInterfaceState: scala.Option[java.lang.String] = None, amazonSideAsn: scala.Option[scala.Long] = None, directConnectGatewayId: scala.Option[java.lang.String] = None, ownerAccount: scala.Option[java.lang.String] = None, bgpPeers: scala.Option[scala.List[models.BGPPeer]] = None, addressFamily: scala.Option[java.lang.String] = None, virtualInterfaceId: scala.Option[java.lang.String] = None, routeFilterPrefixes: scala.Option[scala.List[models.RouteFilterPrefix]] = None, asn: scala.Option[scala.Int] = None, virtualInterfaceName: scala.Option[java.lang.String] = None, authKey: scala.Option[java.lang.String] = None, vlan: scala.Option[scala.Int] = None, location: scala.Option[java.lang.String] = None, customerRouterConfig: scala.Option[java.lang.String] = None, virtualGatewayId: scala.Option[java.lang.String] = None)
final case class Lags(lags: scala.Option[scala.List[models.Lag]] = None)
final case class DirectConnectClientException(message: scala.Option[java.lang.String] = None)
final case class DeleteConnectionRequest(connectionId: java.lang.String)
final case class DirectConnectGatewayAttachment(directConnectGatewayId: scala.Option[java.lang.String] = None, virtualInterfaceOwnerAccount: scala.Option[java.lang.String] = None, attachmentState: scala.Option[java.lang.String] = None, virtualInterfaceId: scala.Option[java.lang.String] = None, stateChangeError: scala.Option[java.lang.String] = None, virtualInterfaceRegion: scala.Option[java.lang.String] = None)
final case class DirectConnectGateway(amazonSideAsn: scala.Option[scala.Long] = None, directConnectGatewayId: scala.Option[java.lang.String] = None, ownerAccount: scala.Option[java.lang.String] = None, directConnectGatewayName: scala.Option[java.lang.String] = None, stateChangeError: scala.Option[java.lang.String] = None, directConnectGatewayState: scala.Option[java.lang.String] = None)
final case class CreateInterconnectRequest(interconnectName: java.lang.String, bandwidth: java.lang.String, location: java.lang.String, lagId: scala.Option[java.lang.String] = None)
final case class AllocatePrivateVirtualInterfaceRequest(connectionId: java.lang.String, ownerAccount: java.lang.String, newPrivateVirtualInterfaceAllocation: models.NewPrivateVirtualInterfaceAllocation)
final case class DeleteDirectConnectGatewayRequest(directConnectGatewayId: java.lang.String)