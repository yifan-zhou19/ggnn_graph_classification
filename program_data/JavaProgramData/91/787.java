package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int k;
		int t;
		String p1;
		String p2;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p2 = p1 = (String)malloc(100 * (Character.SIZE / Byte.SIZE));
		p1 = new Scanner(System.in).nextLine();
		k = p1.length();
		t = (p1.Substring(0));
		for (i = 0;i < k - 1;i++)
		{
		  *(p2.Substring(i)) = *(p1.Substring(i)) + *(p1.Substring(i) + 1);
		}
		if (i = k - 1)
		{
			*(p2.Substring(i)) = *(p1.Substring(i)) + t;
		}
		System.out.printf("%s",p2);
	}

}
