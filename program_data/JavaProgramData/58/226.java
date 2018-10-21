int judge = new int(char *,int);

int main()
{
	String str = new String(new char[100]);
	String p = str;
	String nc = new String(new char[2]);

	int n;
	int i;

	nc = new Scanner(System.in).nextLine();

	n = Integer.parseInt(nc);

	for (i = 0;i < n;i++)
	{
		p = new Scanner(System.in).nextLine();



		System.out.printf("%d\n",judge(p,p.length()));
	}

	return 0;
}

int judge(char * a,int x)
{
	if (*a == '_' || (*a <= 'z' && *a >= 'a') || (*a <= 'Z' && *a >= 'A'))
	{
		int i;
		for (i = 1;i < x;i++)
		{
			if (*(a + i) != '_' && !(*(a + i) <= 'z' && *(a + i) >= 'a') && !(*(a + i) <= 'Z' && *(a + i) >= 'A') && !(*(a + i) >= '0' && *(a + i) <= '9'))
			{
				return 0;
			}
		}
		return 1;

	}



	else
	{
		return 0;
	}
}
