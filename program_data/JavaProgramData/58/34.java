package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int n;
		int i;
		int j;
		int k;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p;
		char[][] s = new char[100][82];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		System.in.read();
		for (i = 0;i < n;i++)
		{
			s[i] = new Scanner(System.in).nextLine();
	   k = 0;
	   p = s[i];
	   {
		   if (((int) * p > 64 && (int) * p < 91) || ((int) * p>96 && (int) * p < 123) || *p == '_')
		   {
			   k = k + 0;
		   }
		   else
		   {
			   k = k + 1;
		   }
	   }
	   p++;
	for (; * p != '\0';p++)
	{
		if (((int) * p > 64 && (int) * p < 91) || ((int) * p>96 && (int) * p < 123) || *p == '_' || ((int) * p>47 && (int) * p < 58))
		{
			k = k + 0;
		}
	else
	{
		k = k + 1;
	}
	}
	if (k == 0)
	{
		System.out.print("1\n");
	}
	else if (k > 0)
	{
		System.out.print("0\n");
	}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
	free(*p);
		}
	}
}

