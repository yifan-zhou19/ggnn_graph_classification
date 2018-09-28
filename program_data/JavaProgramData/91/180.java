package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String p;
		String pnew;
		String p1;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = p1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		pnew = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		for (p = p1,i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i) + 1) != '\0')
			{
			*(pnew.Substring(i)) = (int) * (p.Substring(i)) + (int) * (p.Substring(i) + 1);
			}
			else
			{
				*(pnew.Substring(i)) = (int) * (p.Substring(i)) + (int)(p);
			}
		}
		*(pnew.Substring(i)) = '\0';
		System.out.printf("%s",pnew);
	}

}
