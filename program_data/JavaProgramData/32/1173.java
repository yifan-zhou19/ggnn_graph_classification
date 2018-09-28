package <missing>;

public class GlobalMembers
{
	public static int leap(tangible.RefObject<Integer> p, int n)
	{
		if (n == 0)
		{
			return -1;
		}
		if (p.argValue != 0)
		{
			return 0;
		}
		else
		{
			return leap(p.argValue+1, n - 1) + 1;
		}
	}
	public static int Main()
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
						String a = new String(new char[100]);
						String b = new String(new char[100]);
						int j;
						int k = 0;
						int f = 0;
						int[] c = new int[100];
						String tempVar2 = ConsoleInput.scanfRead();
						if (tempVar2 != null)
						{
							a = tempVar2.charAt(0);
						}
						String tempVar3 = ConsoleInput.scanfRead(" ");
						if (tempVar3 != null)
						{
							b = tempVar3.charAt(0);
						}
						int len1 = a.length();
						int len2 = b.length();
						if (len1 < len2)
						{
							f = -1;
						}
						else if (len1 == len2)
						{
							 for (j = 0;j < len1;j++)
							 {
								  if (a.charAt(j) < b.charAt(j))
								  {
											   f = -1;
											   break;
								  }
							 }
						}
						if (f == -1)
						{
								 System.out.print("-");
								 String s = new String(new char[100]);
								 s = a;
								 a = b;
								 b = s;
								 int len = len1;
								 len1 = len2;
								 len2 = len;
						}
						for (j = len2 - 1;j >= 0;j--)
						{
											  b = tangible.StringFunctions.changeCharacter(b, j + len1 - len2, b.charAt(j));
						}
						for (j = len1 - len2 - 1;j >= 0;j--)
						{
												   b = tangible.StringFunctions.changeCharacter(b, j, '0');
						}
						for (j = len1 - 1;j >= 0;j--)
						{
											  c[j] = a.charAt(j) - b.charAt(j) - k;
											  if (c[j] < 0)
											  {
														c[j] += 10;
														k = 1;
											  }
											  else
											  {
												  k = 0;
											  }
						}
					tangible.RefObject<Integer> tempRef_c = new tangible.RefObject<Integer>(c);
						j = leap(tempRef_c, len1);
						c = tempRef_c.argValue;
						if (j == -1)
						{
							System.out.print("0");
						}
						else
						{
							for (;j < len1;j++)
							{
											 System.out.printf("%d",c[j]);
							}
						}
						System.out.print("\n");
		}
		return 0;
	}
}

