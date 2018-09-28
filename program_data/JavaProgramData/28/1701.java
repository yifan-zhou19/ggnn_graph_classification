package <missing>;

public class GlobalMembers
{
	public static int ss = 0;
//C++ TO JAVA CONVERTER NOTE: This was formerly a static local variable declaration (not allowed in Java):
private static int check_k;
int m;
	public static void check(tangible.RefObject<String> ps)
	{
	//C++ TO JAVA CONVERTER NOTE: This static local variable declaration (not allowed in Java) has been moved just prior to the method:
	//	static int k,m; //k:lengh of word   ;  m:former-0->' '//
		if (ps.argValue == ' ' || ps.argValue == '\0')
		{
			if (m == 1)
			{
				m = 0;
				if (ss == 0)
				{
					ss = 1;
					System.out.printf("%d",check_k);
				}
				else
				{
					System.out.printf(",%d",check_k);
				}
			m = 0;
			check_k = 0;
			}
			if (ps.argValue == '\0')
			{
				return;
			}
		}
		else
		{
			m = 1;
			check_k++;
		}
		check(ps.argValue.Substring(1));
	}


	public static int Main()
	{
		String p;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'malloc' has no equivalent in Java:
		p = (String)malloc(10000 * (Character.SIZE / Byte.SIZE));
		p = new Scanner(System.in).nextLine();
	tangible.RefObject<String> tempRef_p = new tangible.RefObject<String>(p);
		check(tempRef_p);
		p = tempRef_p.argValue;
	}
}

