package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		 String p;
		 String q;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc((Character.SIZE / Byte.SIZE) * 101);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		q = (String)malloc((Character.SIZE / Byte.SIZE) * 101);
		p = new Scanner(System.in).nextLine();
		int i;
		int n = p.length();
		for (i = 0;i < n;i++)
		{
			if (i == n - 1)
			{
				*(q.Substring(i)) = *(p.Substring(i)) + p;
			}
			else
			{
				*(q.Substring(i)) = *(p.Substring(i)) + *(p.Substring(i) + 1);
			}

		}

	//	*(q+n)='\0';
		System.out.println(q);
	}

}
