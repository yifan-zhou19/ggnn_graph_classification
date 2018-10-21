package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		//char a[10000];
		String p;
		String p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p1 = p = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		int i;
		int n;
		for (i = 0; * (p.Substring(i) - 1) != '\n';i++)
		{
								String tempVar = ConsoleInput.scanfRead(null, 1);
								if (tempVar != null)
								{
									(p.Substring(i)) = Integer.parseInt(tempVar);
								}
								//printf("%c",*(p+i));
		}
		n = i;
		//gets(a);
		//p=p1;
		for (; p != '\0';p++)
		{
							 if (((p != ' ') && (*(p.Substring(1)) == ' ')) || ((p == ' ') && (*(p.Substring(1)) != ' ')) || ((p != ' ') && (*(p.Substring(1)) != ' ')) || ((p != ' ') && (*(p.Substring(1)) == '\0')))
							 {
										  System.out.printf("%c", p);
							 }
		}
		return 0;
	}
}

