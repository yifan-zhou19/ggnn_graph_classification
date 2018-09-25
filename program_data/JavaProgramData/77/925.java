void pair(char [],int,int);
int main()
{
	int len;
	int t;
	String s = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		s = tempVar.charAt(0);
	}
	len = s.length();
	t = 0;
	pair(s,len,t);
	return 0;
}
void pair(char s[],int len,int t)
{
	int i;
	int j;
	int count = 0;
	i = 1;
	if (t == len - 2)
	{
			System.out.printf("0 %d\n",len - 1);
			return;
	}
	while (s[i] == s[0] || s[i] == ' ')
	{
		i++;
	}
	for (j = i - 1;s[j] == ' ';j--)
	{
		count++;
	}
	System.out.printf("%d %d\n",i - count - 1,i);
	s[i - count - 1] = ' ';
	s[i] = ' ';
	pair(s,len,t + 2);
}

