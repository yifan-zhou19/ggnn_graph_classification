package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int i;
		String s1 = new String(new char[100]);
		String s2 = new String(new char[100]);
		s1 = new Scanner(System.in).nextLine();
		s2 = new Scanner(System.in).nextLine();
		for (i = 0; s1.charAt(i) && s2.charAt(i); i++)
		{
			if (s1.charAt(i) >= 'a' && s1.charAt(i) <= 'z')
			{
				s1.charAt(i) -= 'a'-'A';
			}
			if (s2.charAt(i) >= 'a' && s2.charAt(i) <= 'z')
			{
				s2.charAt(i) -= 'a'-'A';
			}

			if (s1.charAt(i) > s2.charAt(i))
			{
				System.out.print(">");
			}
			else
			{
			if (s1.charAt(i) < s2.charAt(i))
			{
				System.out.print("<");
			}
			}
		}
		if (s1.charAt(i) == 0)
		{
			if (s2.charAt(i) == 0)
			{
				System.out.print("=");
			}
			else
			{
				System.out.print("<");
			}
		}
		else
		{
			System.out.print(">");
		}
		/*
			if(strcmp(s1,s2)==0){
				printf("=");
	//			break;
			}
			if(strcmp(s1,s2)<0){
				printf("<");
	//			break;
			}
			if(strcmp(s1,s2)>0){
				printf(">");
	//			break;
	
		}
		
	*/
	}

}
