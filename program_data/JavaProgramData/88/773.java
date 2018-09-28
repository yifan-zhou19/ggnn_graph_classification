package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//char a[32];
		int i;
		String p;
		String p1;
		String q;
		//gets(a);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p = (String)malloc(32 * (Character.SIZE / Byte.SIZE));
		for (i = 0; * (p.Substring(i) - 1) != '\n';i++)
		{
								 String tempVar = ConsoleInput.scanfRead(null, 1);
								 if (tempVar != null)
								 {
									 (p.Substring(i)) = Integer.parseInt(tempVar);
								 }
		}
		//p=p1;
		for (q = (p.Substring(32));;q--)
		{
						  if (q > 47 && q < 58)
						  {
							  break;
						  }
		}
		for (; p != '\0';p++)
		{
						  if (p < q)
						  {
								 if ((p > 47 && p < 58) && (*(p.Substring(1))>47 && *(p.Substring(1)) < 58))
								 {
																	System.out.printf("%c", p);
								 }
								 if ((p > 47 && p < 58) && (*(p.Substring(1)) < 48 || *(p.Substring(1))>57))
								 {
																	System.out.printf("%c\n", p);
								 }
						  }
						  if (p == q)
						  {
								  System.out.printf("%c", p);
								  break;
						  }
		}
		return 0;
	}
}

