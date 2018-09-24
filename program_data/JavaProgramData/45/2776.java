package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String a = new String(new char[100]);
		int i = 0;
		int j = 0;
		String b = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(a,0,(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(b,0,(Character.SIZE / Byte.SIZE));
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

		int l1 = b.length();
		int l2 = a.length();
		for (i = 0;i < l1;i++)
		{
			if (a.charAt(0) == b.charAt(i))
			{
				j = 0;
				while (j < l2)
				{
					if (a.charAt(0 + j) != b.charAt(i + j))
					{
					break;
					}
					else
					{
					j++;
					}
				}

			 if (j == l2)
			 {
				 System.out.printf("%d",i);
			 break;
			 }
			}
		}
	}

}

