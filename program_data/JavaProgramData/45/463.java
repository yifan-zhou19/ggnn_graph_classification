package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String str1 = new String(new char[50]);
		String str2 = new String(new char[50]);
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p1;
//C++ TO JAVA CONVERTER TODO TASK: Pointer arithmetic is detected on this variable, so pointers on this variable are left unchanged:
		char * p2;
		int k;
		int f;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			str2 = tempVar.charAt(0);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			str1 = tempVar2.charAt(0);
		}
		p1 = str1;
		p2 = str2;
		for (; * p1 != '\0';)
		{
			if (*p1 == *p2)
			{
				k = p1 - str1;
				for (; * p2 != '\0';p2++,p1++)
				{
					if (*p2 == *p1)
					{
						f = 1;
					}
					else
					{
						f = 0;
						break;
					}

				}
			if (f == 1)
			{
				System.out.printf("%d",k);
				break;
			}
			else
			{
				p1 = str1.Substring(k) + 1;
			}


			}
			else
			{
				p1++;
			}



		}

	}
}

