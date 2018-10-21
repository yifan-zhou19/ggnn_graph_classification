package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct sub
	//	{
	//		   char a[5];
	//		   int counter;
	//	}
	//	sub[500],*p1=sub,*p2;
		int i;
		int j;
		int k;
		int n;
		int len;
		int counter = 0;
		int mark;
		int flag;
		int max = 0;
		String str = new String(new char[501]);
		String pstr1;
		String pstr2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str = tempVar2.charAt(0);
		}
		len = str.length();
		pstr2 = str;
		for (i = 0;i < len + 1 - n;i++)
		{
							  pstr1 = (p1 + i).a;
						for (j = 0;j < n;j++)
						{
										  *(pstr1.Substring(j)) = *(pstr2.Substring(i) + j);
						}
						*(pstr1.Substring(n)) = '\0';
						counter++;
		}
		for (i = 0;i < counter;i++)
		{
							  mark = 1;
							  pstr1 = (p1 + i).a;
							  for (j = i + 1;j < counter;j++)
							  {
													  pstr2 = (p1 + j).a;
													  flag = 0;
													  for (k = 0;k < n;k++)
													  {
																	  if (*(pstr1.Substring(k)) == *(pstr2.Substring(k)))
																	  {
																	  flag++;
																	  }
													  }
													  if (flag == n)
													  {
													  mark++;
													  }
							  }
							  if (mark > max)
							  {
							  max = mark;
							  }
							  (p1 + i).counter = mark;
		}
		if (max == 1)
		{
		System.out.print("NO");
		}
		else
		{
			System.out.printf("%d\n",max);
			for (i = 0;i < counter;i++)
			{
			if ((p1 + i).counter == max)
			{
			System.out.printf("%s\n",(p1 + i).a);
			}
			}
		}
		return 0;
	}
}

