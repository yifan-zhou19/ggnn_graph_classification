package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int len;
		char a;
		char b;
		String name;
		String final;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		name = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		final = (String)malloc(101 * (Character.SIZE / Byte.SIZE));
		name = new Scanner(System.in).nextLine();
		len = name.length();
		for (i = 0;i < len - 1;i++)
		{
			a = (name.Substring(i));
			b = (name.Substring(i) + 1);
			*(final.Substring(i)) = a + b;
		}
		a = (name.Substring(i));
		b = (name);
		*(final.Substring(i)) = a + b;
		*(final.Substring(len)) = '\0';
		System.out.printf("%s\n",final);
	}
}
