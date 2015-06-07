import urllib
import urllib.parse
import urllib.request
#import urllib.parse
#import urllib.request


import argparse
import pprint


import json

import io

import sys






host= 'api.yelp.com'
path = '/v2/business'
url = 'http://{0}{1}?'.format(host, urllib.parse.quote(path.encode('utf8')))
print(url)



#BASE_URL='http://www.yelp.com/search?find_desc=Coffee+%26+Tea&find_loc=San+Francisco%2C+CA&ns=1'

#local_file, headers = urllib.request.urlretrieve(BASE_URL)
#response = open(local_file)

#print(response.read())




"""
#BASE_URL = 'https://maps.googleapis.com/maps/api/directions/json?origin=Toronto&destination=Montreal&mode=walking'
BASE_URL = 'https://maps.googleapis.com/maps/api/directions/json?origin=500+brannan+st,+san+francisco,+ca&destination=3400+Richmond+Parkway,+Richmond,+CA&mode=walking'
#url = urllib.request.Request(BASE_URL)


local_file, headers = urllib.request.urlretrieve(BASE_URL)

response = open(local_file)

results = json.load(response)
print(results['routes'])
#print(json.dumps([s['routes']]))

#print(json.dumps([s['legs'] for s in results['routes']], indent=2))

#url = urllib.request.urlopen(BASE_URL)
#print(url.read())
#print(url.read())


#js = json.load(url)
#print(js.dumps())
"""









"""
#request = Request("https://maps.googleapis.com/maps/api/directions/json?origin=Toronto&destination=Montreal&mode=walking")

BASE_URL = 'https://maps.googleapis.com/maps/api/directions/json?origin=Toronto&destination=Montreal&mode=walking'

url = urllib.request.urlopen(BASE_URL)

#print(url.read())
f = url.read()
print(f)

#f = open(urllib.request.urlopen(BASE_URL))
result = json.load(url)

print(json.dumps([s['formatted_address'] for s in result['results']], indent=2))
"""


#def getdir(address, **dir_args):
#    dir_args.update({
#        '?' : address
#    })

#    params = urllib.parse.urlencode(dir_args)
#    print(params)
#    url = BASE_URL + '?' + params   #urllib.parse.urlencode(dir_args, encoding='UTF-8'))
    #url = BASE_URL + dir_args
#    print(url)

#    try:
#    except:
 #       sys.exit()



#if __name__ == '__main__':
#    getdir("origin=Toronto&destination=Montreal&mode=walking")



#html = open(local_filename)

#response = json.load(html)

#print(response['routes'])




#html.close()
