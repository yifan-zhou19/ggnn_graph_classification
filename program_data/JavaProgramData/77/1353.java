package <missing>;

public class GlobalMembers
{
	//Patricia.Xiao
	//????????

	public static String line = new String(new char[110]);
	public static char boy;
	public static char girl;

	public static int match(int i,int l)
	{
		//printf("%c %c\n",boy,girl);  //debug
		//printf("%s",line);
		//debug?line????????????????????
		int j;
		if (i == l)
		{
			return 0; //??
		}
		if (line.charAt(i) == girl) //????
		{
			for (j = i - 1;j >= 0;j--)
			{
				if (line.charAt(j) == boy)
				{
					//printf("%d %d\n",i,j);  //debug
					System.out.printf("%d %d\n",j,i);
					line = tangible.StringFunctions.changeCharacter(line, j, ' ');
					break; //????????????????else?????bug?
				}
			}
		}
		match(i + 1, l);
		return 0;
	}
	public static int Main()
	{
		int l;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			line = tempVar.charAt(0);
		}
		l = line.length();
		boy = line.charAt(0); //????????????
		for (i = 1;i < l;i++)
		{
			if (line.charAt(i) != boy)
			{
				girl = line.charAt(i);
				break;
			}
		}
		//printf("%d\n",l);  //debug
		match(0, l); //??
		return 0;
	}
}

