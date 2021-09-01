import request from '@/utils/request'
const API_URL = "/server";

export function getUserName(data) {
  return request({
    url: API_URL+'/user/getUserName',
    method: 'post',
    data: data
  })
}

export function getUserAge(data) {
  return request({
    url: API_URL+'/user/getUserAge',
    method: 'get',
    params: data
  })
}
