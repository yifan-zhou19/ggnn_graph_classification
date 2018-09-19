// Program Test.cpp : ??????????????
//

public class Vocabulary
{
	public String character = new String(new char[Vocabularysize]);
	public Vocabulary next;
}

package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static String str = new String(new char[Sentencelength]);
	public static Vocabulary create()
	{
		int i;
		Vocabulary head;
		Vocabulary p1;
		Vocabulary p2;
		n = 0;
		int k = 0;
		int l = 0;
		p1 = p2 = new Vocabulary(); //?????????
		for (l = k;str.charAt(l) != ' ';l++)
		{
			;
		}
		for (i = k;i < l;i++)
		{
			p1.character = tangible.StringFunctions.changeCharacter(p1.character, i, str.charAt(i));
		}
		p1.character = tangible.StringFunctions.changeCharacter(p1.character, i, '\0');
		k = l + 1;
		i = 0;
		head = null;

		while (str.charAt(i) != '\0')
		{
			n = n + 1; //?????????????????????
			if (n == 1)
			{
				head = p1;
			}
			else
			{
				p2.next = p1;
			}
			p2 = p1;
			p1 = new Vocabulary();

			if (str.charAt(l) != '\0')
			{
				for (l = k;str.charAt(l) != ' ' && l <= str.length() - 1;l++)
				{
					;
				}
				int m;
				for (i = k,m = 0;i < l;i++,m++)
				{
					p1.character = tangible.StringFunctions.changeCharacter(p1.character, m, str.charAt(i));
				}
				p1.character = tangible.StringFunctions.changeCharacter(p1.character, m, '\0'); //copy the character
				k = l + 1;
			}
			else
			{
				i = l;
			}
		}

		p2.next = p1;
		p2 = p1;
		p2.next = null;

	return (head);
	}

	public static void print(Vocabulary head)
	{
		Vocabulary p;
		p = head;
		for (p = head;p.next != null;p = p.next)
		{
			System.out.printf("%s ",p.character);
		}
		System.out.printf("%s\n",p.character);


	}
	public static int Main()
	{
		Vocabulary head;
		str = new Scanner(System.in).nextLine();
	//
		String stra = new String(new char[Sentencelength]);
		String strb = new String(new char[Sentencelength]);
		stra = new Scanner(System.in).nextLine();
		strb = new Scanner(System.in).nextLine();
	//
		head = create();
		Vocabulary p = head;

		for (p = head;p != null;p = p.next)
		{
	//
			if (strcmp(p.character,stra) == 0)
			{
				p.character = strb;
			}


		}
		print(head);
		return 0;
	}

}

