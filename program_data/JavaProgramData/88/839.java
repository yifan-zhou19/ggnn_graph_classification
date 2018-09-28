package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	 String p;
	 int i;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	 p = (String)malloc(31 * (Character.SIZE / Byte.SIZE));
	 for (i = 0;i < 31;i++)
	 {
		String tempVar = ConsoleInput.scanfRead(null, 1);
		if (tempVar != null)
		{
			(p.Substring(i)) = Integer.parseInt(tempVar);
		}
	 }
	 for (i = 0;i < 31;i++)
	 {
		 if ((*(p.Substring(i)) != '0') && (*(p.Substring(i)) != '1') && (*(p.Substring(i)) != '2') && (*(p.Substring(i)) != '3') && (*(p.Substring(i)) != '4') && (*(p.Substring(i)) != '5') && (*(p.Substring(i)) != '6') && (*(p.Substring(i)) != '7') && (*(p.Substring(i)) != '8') && (*(p.Substring(i)) != '9'))
		 {
		 System.out.print("\n");
		 }
		 else
		 {
		 System.out.printf("%c",*(p.Substring(i)));
		 }
	 }
	}
}

