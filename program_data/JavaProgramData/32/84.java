void calculate(int);
int main()
{
	int n;
	int i;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (i = 0;i < n;i++)
	{
		calculate(n - i == 1?0:1);
	}
	return 0;
}
void calculate(int isblank)
{
	String large = new String(new char[101]);
	String small = new String(new char[101]);
	String dif = new String(new char[101]);
	int large_len;
	int small_len;
	int digit_L;
	int digit_S;
	int digit_dif;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p_L;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p_S;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
	char * p_dif;
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		large = tempVar2.charAt(0);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		small = tempVar3.charAt(0);
	}
	large_len = large.length();
	p_L = large.Substring(large_len) - 1;
	small_len = small.length();
	p_S = small.Substring(small_len) - 1;
	p_dif = dif.Substring(large_len) - 1;
	*(p_dif + 1) = 0;
	while (p_S - small.Substring(1) != null)
	{
		digit_L = p_L - '0';
		digit_S = p_S - '0';
		digit_dif = digit_L - digit_S;
		if (digit_dif < 0)
		{
			digit_dif += 10;
			(*(p_L - 1))--;
		}
		*p_dif = digit_dif + '0';
		p_L--;
		p_S--;
		p_dif--;
	}
	while (p_L >= large)
	{
		*p_dif = p_L;
		if (*p_L < '0')
		{
			*p_dif += 10;
			(*(p_L - 1))--;
		}
		p_L--;
		p_dif--;
	}
	do
	{
		p_dif++;
	} while (*p_dif == '0');
	if (*p_dif != null)
	{
		System.out.println(p_dif);
	}
	else
	{
		System.out.print("0\n");
	}
	if (isblank)
	{
		dif = new Scanner(System.in).nextLine();
	}
}








