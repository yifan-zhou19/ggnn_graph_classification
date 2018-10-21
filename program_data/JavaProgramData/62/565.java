package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		String c = new String(new char[100]);
		String q;
		q = c;
		q = new Scanner(System.in).nextLine();
		for (i = 0; * (q.Substring(i)) != '\0';i++)
		{
			if (*(q.Substring(i)) == ' ' && *(q.Substring(i) + 1) == ' ')
			{
				for (j = i; * (q.Substring(j)) != '\0';j++)
				{
					*(q.Substring(j)) = *(q.Substring(j) + 1);
				}
				i--;
			}
		}
		System.out.println(q);
	}
}
