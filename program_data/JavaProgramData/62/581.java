package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		String s;
	int i;
	int j;
	int flag;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
	s = (String)malloc(100000 * (Character.SIZE / Byte.SIZE));
	s = new Scanner(System.in).nextLine();
	for (i = 0; * (s.Substring(i)) != '\0';i++)
	{
		if (*(s.Substring(i)) == ' ')
		{
		   if (flag == 0)
		   {
			   for (j = i; * (s.Substring(j)) != '\0';j++)
			   {
				   *(s.Substring(j)) = *(s.Substring(j) + 1);
			   }
			   i--;
		   }
		   flag = 0;
		}
	 else
	 {
		 flag = 1;
	 }
	}
	System.out.println(s);

	}

}
