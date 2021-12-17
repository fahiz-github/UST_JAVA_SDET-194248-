from selenium import webdriver
from selenium.webdriver.common.action_chains import ActionChains
from selenium.webdriver.common.by import *
driver=webdriver.Chrome("E:\\chromedriver_win32\\chromedriver.exe")
driver.get("https://www.urbanladder.com/login")
print("url verified")


el=driver.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div/div[2]/div[3]/form/div/input")
el.send_keys("111@gmail.com")
driver.implicitly_wait(100)
elk=driver.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div/div[2]/div[3]/form/div/div/div/input")
print(elk)
elk.send_keys("11111111")
driver.find_element(By.XPATH,"/html/body/div[1]/div[1]/div[2]/div/div/div[1]/div/div[2]/div[3]/form/input[3]").click()
print("logged in")

ob=driver.find_element(By.XPATH,"/html/body/div[1]/header/div[2]/div/nav/div/ul/li[1]/span")
print(ob)
hover = ActionChains(driver).move_to_element(ob)
hover.perform()
print(" hover performed")
a=driver.find_element(By.XPATH,"/html/body/div[1]/header/div[2]/div/nav/div/ul/li[1]/div/div/ul/li[1]/ul/li[4]/a/span")
a.click()
print("moved to sofa beds")


ActionChains(driver).move_to_element(driver.find_element(By.XPATH,"/html/body/div[2]/header/div[2]/div/nav/div/ul/li[1]/span")).perform()
driver.find_element(By.XPATH,"/html/body/div[2]/header/div[2]/div/nav/div/ul/li[1]/div/div/ul/li[2]/ul/li[7]/a/span").click()
print("moved to dining table sets")

ActionChains(driver).move_to_element(driver.find_element(By.XPATH,"/html/body/div[2]/header/div[2]/div/nav/div/ul/li[1]/span")).perform()
driver.find_element(By.XPATH,"/html/body/div[2]/header/div[2]/div/nav/div/ul/li[1]/div/div/ul/li[4]/ul/li[1]/a/span").click()
print("moved to hyderabad store")


ActionChains(driver).move_to_element(driver.find_element(By.XPATH,"/html/body/div[1]/div/header/div[2]/nav/ul/li[1]/h4")).perform()
driver.find_element(By.XPATH,"/html/body/div[1]/div/header/div[2]/nav/ul/li[1]/ul/li[3]/ul/li[4]/a").click()
print("moved to carpets")

ActionChains(driver).move_to_element(driver.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[2]/div[1]")).perform()
driver.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[2]/div[2]/div/div/div/ul/li[2]/input").click()
print("filter by blue color")

ActionChains(driver).move_to_element(driver.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[1]")).perform()
driver.find_element(By.XPATH,"/html/body/div[2]/div[2]/div[3]/div[2]/div[1]/div/form/div[1]/div/div/ul/li[1]/div[2]/div/div/ul/li[2]/div[2]/label/input").click()
print("filter by prize")



