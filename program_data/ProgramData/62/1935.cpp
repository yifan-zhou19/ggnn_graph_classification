//********************************
//*????1.cpp                **
//*??????????         **
//*?????? 1200012834      **
//*???2012.11.30             **
//********************************


void del(char str[100])         // ????????del
{
	int i, j, count;            // count????????????????
	for (i = 0; str[i] != '\0'; i++)
	{
		if (str[i] == ' ' && str[i+1] == ' ')  // ????????
		{
			count = 0;
			for (j = i + 1; str[j+1] != '\0'; j++)  // ???????????
			{
				str[j] = str[j+1];
				count++;            // ?????????
			}
			str[i+1+count] = '\0';  // i+1+count??????str???
			                        // ????????????\0??
			i--;                    // i?????????
		}
	}
	cout << str;
}

int main()
{
	char str[100];
	cin.getline(str, 100);  // ?????
	del(str);
	return 0;
}