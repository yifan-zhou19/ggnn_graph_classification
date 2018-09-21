package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i = 0;
		String p = new String(new char[100]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(10000 * (Character.SIZE / Byte.SIZE));
		while (scanf("%s",p.Substring(i)) != EOF) //EOF?????
		{
			i++;
		}
		i--; //??????????,?????
			for (;i > 0;i--)
			{
			System.out.printf("%s ",p.Substring(i));
			}
		System.out.printf("%s",p);
	}
}
