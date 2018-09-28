package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		 String str;
		 int i = 0;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'calloc' has no equivalent in Java:
		 str = (String)calloc(100,(Character.SIZE / Byte.SIZE));
		 str = new Scanner(System.in).nextLine();
		 while (*(str.Substring(i)) != '\0')
		 {
			 if ((*(str.Substring(i)) <= 57 && *(str.Substring(i)) >= 48) && (*(str.Substring(i) + 1) > 57 || *(str.Substring(i) + 1) < 48))
			 {
				 System.out.printf("%c\n",*(str.Substring(i)));
			 }
			 if ((*(str.Substring(i)) <= 57 && *(str.Substring(i)) >= 48) && (*(str.Substring(i) + 1) <= 57 && *(str.Substring(i) + 1) >= 48))
			 {
				 System.out.printf("%c",*(str.Substring(i)));
			 }
			 i = i + 1;
		 }
	}

}
