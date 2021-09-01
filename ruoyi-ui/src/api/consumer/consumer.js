import request from '@/utils/request'
const API_URL = "/consumer";

export function getUserNameFeign(data) {
  return request({
    url: API_URL+'/getUserName',
    method: 'post',
    data: data
  })
}

