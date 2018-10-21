package <missing>;

public class GlobalMembers
{
	//bug????????
	public static int Main()
	{
		int i;
		int j;
		int n;
		int l;
		int num;
		String a = new String(new char[50]); //????
		String s = new String(new char[160]); //??
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i <= n;i++)
		{
			//printf("%d ",i);  //debug
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				a = tempVar2.charAt(0);
			}
			l = a.length();
			if ((num + l >= 80) || (n == i)) //????????
			{
				System.out.printf("%s\n",s); //?????
				num = 0; //???????
			}
			else
			{
				if (num > 0) //???????
				{
					*(s.Substring(num)) = ' ';
					num++; //????
				}
			}
			for (j = 0;j < l;j++)
			{
				*(s.Substring(num) + j) = *(a.Substring(j));
			}
			*(s.Substring(num) + l) = '\0';
			num += l; //???
			//printf("%d %s\n",i,s);  //debug
		}
		return 0;
	}
}

