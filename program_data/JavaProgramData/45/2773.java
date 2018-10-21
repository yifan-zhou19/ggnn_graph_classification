int locate = new int(char [],char []);
int main()
{
	String a = new String(new char[100]);
	String b = new String(new char[100]);
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a = tempVar.charAt(0);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b = tempVar2.charAt(0);
	}
	System.out.printf("%d",locate(a,b));
	return 0;
}

int locate(char a[],char b[]) //?????????
{
	int i;
	int j = 0;
	int len = a.length();
	int lene = b.length();
	for (i = 0;i < lene;i++) //?????????????????
	{
		int k = i;
		while (j < len)
		{

			if (a[j] == b[k])
			{
				  if (j == len - 1)
				  {
				return (i);
				break;
				  }
				j++;
				k++;

			}
			else
			{
				j = 0;
				break;
			}



		}
	}

}


