package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int day = 0;
		sy = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sm = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sd = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ey = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		em = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		ed = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (sy != ey || sm != em || sd != ed)
		{
			day++;
			if ((sd == 31 && (sm == 1 || sm == 3 || sm == 5 || sm == 7 || sm == 8 || sm == 10)) || (sd == 30 && (sm == 4 || sm == 6 || sm == 9 || sm == 11)))
			{
				//cout<<sy<<" "<<sm<<" "<<sd<<endl;
				sd = 1;
				sm += 1;
			}
			else if (sd == 29 && sm == 2 && ((sy % 4 == 0 && sy % 100 != 0) || sy % 400 == 0))
			{
				//cout<<sy<<" "<<sm<<" "<<sd<<endl;
				sd = 1;
				sm += 1;
			}
			else if (sd == 28 && sm == 2 && (!((sy % 4 == 0 && sy % 100 != 0) || sy % 400 == 0)))
			{
				//cout<<sy<<" "<<sm<<" "<<sd<<endl;
				sd = 1;
				sm += 1;
			}
			else if (sd == 31 && sm == 12)
			{
				//cout<<sy<<" "<<sm<<" "<<sd<<endl;
				sy += 1;
				sm = 1;
				sd = 1;
			}
			else
			{
				sd += 1;
			}
		}
		System.out.print(day);
		System.out.print("\n");
		return 0;
	}

}

