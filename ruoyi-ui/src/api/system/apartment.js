import request from '@/utils/request'

// 查询公寓管理列表
export function listApartment(query) {
  return request({
    url: '/system/apartment/list',
    method: 'get',
    params: query
  })
}

// 查询公寓管理详细
export function getApartment(apartmentId) {
  return request({
    url: '/system/apartment/' + apartmentId,
    method: 'get'
  })
}

export function getApartment2(buildingId){
  return request({
    url: '/system/apartment/build/' + buildingId,
    method:'get'
  })
}

// 新增公寓管理
export function addApartment(data) {
  return request({
    url: '/system/apartment',
    method: 'post',
    data: data
  })
}

// 修改公寓管理
export function updateApartment(data) {
  return request({
    url: '/system/apartment',
    method: 'put',
    data: data
  })
}

// 删除公寓管理
export function delApartment(apartmentId) {
  return request({
    url: '/system/apartment/' + apartmentId,
    method: 'delete'
  })
}
//改变房间状态
export function changeApartmentStatus(apartmentId, status) {
  const data = {
    apartmentId,
    status
  }
  return request({
    url: '/system/apartment/changeStatus',
    method: 'put',
    data: data
  })
}
