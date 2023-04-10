from django.urls import path
from mainpage.views import home 

urlpatterns = [
    path('',home),

]