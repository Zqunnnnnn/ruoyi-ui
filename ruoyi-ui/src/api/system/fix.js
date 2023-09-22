import request from '@/utils/request'

// 查询维修列表
export function listFix(query) {
  return request({
    url: '/system/fix/list',
    method: 'get',
    params: query
  })
}

// 查询维修详细
export function getFix(fixId) {
  return request({
    url: '/system/fix/' + fixId,
    method: 'get'
  })
}

// 新增维修
export function addFix(data) {
  return request({
    url: '/system/fix',
    method: 'post',
    data: data
  })
}

// 修改维修
export function updateFix(data) {
  return request({
    url: '/system/fix',
    method: 'put',
    data: data
  })
}

// 删除维修
export function delFix(fixId) {
  return request({
    url: '/system/fix/' + fixId,
    method: 'delete'
  })
}
