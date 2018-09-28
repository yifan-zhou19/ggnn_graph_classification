package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String p;
	  int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p = malloc(31 * (Character.SIZE / Byte.SIZE));
	  p = new Scanner(System.in).nextLine();
	  for (i = 0;i < 31;i++)
	  {
		if (*(p.Substring(i)) == '\0')
		{
			break;
		}
		else if (*(p.Substring(i)) > 47 && *(p.Substring(i)) < 58)
		{
			System.out.printf("%c",*(p.Substring(i)));
		}
		if (*(p.Substring(i) + 1) < 48 || *(p.Substring(i) + 1)>57)
		{
			System.out.print("\n");
		}
	  }
	}
}
