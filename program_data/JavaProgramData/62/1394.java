package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		p = (String)calloc(1000,(Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		for (i = 0; * (p.Substring(i)) != '\0';i++)
		{
			if (*(p.Substring(i)) != ' ')
			{
		System.out.printf("%c",*(p.Substring(i)));
			}
		else
		{
			 if (*(p.Substring(i) + 1) != ' ')
			 {
			 System.out.print(" ");
			 }
		}
		}
	}
}
