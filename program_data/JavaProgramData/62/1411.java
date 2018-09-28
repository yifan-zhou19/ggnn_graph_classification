package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		String p;
		int i;
		int j;
		int k;
		int l;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(50 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
		l = p.length();
		for (i = 0;i < l;i++)
		{
			if (*(p.Substring(i)) == ' ')
			{
				  System.out.printf("%c",*(p.Substring(i)));
				   for (k = i + 1;k < l;k++)
				   {
				   if (*(p.Substring(k)) != ' ')
				   {
					   i = k - 1;
					   break;
				   }
				   }
			}

			 else
			 {
				 System.out.printf("%c",*(p.Substring(i)));
			 }

		}

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(p);
	}


}
