#!/usr/bin/env python

from productionyelp import *

import json
import urllib
import urllib
inputDict = {}



def get_street(location):
    return location['address']

def get_state(location):
    return location['state_code']

def get_city(location):
    return location['city']




#test = query_api("dinner", "san francisco")

#print test

# def get_input():
#     user_input_place = raw_input("Where would you like to go?")
#     user_input_activity = raw_input("What would you like to do?")
#     inputDict[user_input_place] = user_input_activity
#     user_input_more = raw_input("More?")
#     if user_input_more.lower() == "yes":
#         get_input()
#
# if __name__ == '__main__':
#     get_input()
#     print inputDict





#query = query_api()


# #test = query_api("tacos", "salinas")
# test = query_api(user_input_activity, user_input_place)
# #street = test["location"]["address"]
# street = get_street(test['location'])
# city = get_city(test['location'])
# #street = street.replace(" ", "+")
# street = json.dumps(street)
# street = street.replace(" ", "+")
# street = street.strip("\"").strip("[").strip("]")
# city = city.replace(" ", "+")
# state = get_state(test['location'])
#
# #BASE_URL = 'https://maps.googleapis.com/maps/api/directions/json?origin=500+brannan+st,+san+francisco,+ca&destination=3400+Richmond+Parkway,+Richmond,+CA&mode=walking'
# BASE_URL = 'https://maps.googleapis.com/maps/api/directions/json?origin=3400+Richmond+Parkway,+Richmond,+CA&destination={0},+{1},+{2}&mode=driving'.format(street, city, state)
#
#
# #local_file, headers = urllib.urlopen(BASE_URL)
# local_file = urllib2.urlopen(BASE_URL)
# #print local_file
#
# #response = open(local_file, "r")
#
# #results = json.load(response)
# results = json.load(local_file)
#
# for i in results['routes'][0]['legs']:
#     for l in  i["steps"]:
#         print l['html_instructions']





