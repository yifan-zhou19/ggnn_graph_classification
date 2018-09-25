package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  String p;
	  int i;
	  int n;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	  p = (String)malloc(30 * (Character.SIZE / Byte.SIZE));
	  p = new Scanner(System.in).nextLine();
	  n = p.length();
	  for (i = 0;i < n;i++)
	  {
		  if ((*(p.Substring(i)) == '0') || (*(p.Substring(i)) == '1') || (*(p.Substring(i)) == '2') || (*(p.Substring(i)) == '3') || (*(p.Substring(i)) == '4') || (*(p.Substring(i)) == '5') || (*(p.Substring(i)) == '6') || (*(p.Substring(i)) == '7') || (*(p.Substring(i)) == '8') || (*(p.Substring(i)) == '9'))
		  {
			  System.out.printf("%c",*(p.Substring(i)));
		  }
		  if (((*(p.Substring(i)) == '0') || (*(p.Substring(i)) == '1') || (*(p.Substring(i)) == '2') || (*(p.Substring(i)) == '3') || (*(p.Substring(i)) == '4') || (*(p.Substring(i)) == '5') || (*(p.Substring(i)) == '6') || (*(p.Substring(i)) == '7') || (*(p.Substring(i)) == '8') || (*(p.Substring(i)) == '9')) && (((*(p.Substring(i) + 1) == '0') || (*(p.Substring(i) + 1) == '1') || (*(p.Substring(i) + 1) == '2') || (*(p.Substring(i) + 1) == '3') || (*(p.Substring(i) + 1) == '4') || (*(p.Substring(i) + 1) == '5') || (*(p.Substring(i) + 1) == '6') || (*(p.Substring(i) + 1) == '7') || (*(p.Substring(i) + 1) == '8') || (*(p.Substring(i) + 1) == '9')) == 0))
		  {
			  System.out.print("\n");
		  }
	  }
	}
}
