import request from '@/utils/request'

// 查询入住管理列表
export function listLive(query) {
  return request({
    url: '/system/live/list',
    method: 'get',
    params: query
  })
}

// 查询入住管理详细
export function getLive(liveId) {
  return request({
    url: '/system/live/' + liveId,
    method: 'get'
  })
}

// 新增入住管理
export function addLive(data) {
  return request({
    url: '/system/live',
    method: 'post',
    data: data
  })
}

// 修改入住管理
export function updateLive(data) {
  return request({
    url: '/system/live',
    method: 'put',
    data: data
  })
}

// 删除入住管理
export function delLive(liveId) {
  return request({
    url: '/system/live/' + liveId,
    method: 'delete'
  })
}
