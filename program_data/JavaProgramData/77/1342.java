int lefts = new int(char *,char *);
char boy;
char girl;
int main()
{
	final String children = "";
	int i;
	int left;
	int right;
	int sum;
	children = ConsoleInput.readToWhiteSpace(true).charAt(0);
	sum = children.length();
	boy = children.charAt(0);
	girl = children.charAt(sum - 1);
	for (i = 0;i < sum;i++)
	{
		if (children.charAt(i) == girl) //??????girl???????lefts??????
		{
			right = i;
			left = lefts(children,children.Substring(i));
			if (i < sum - 1)
			{
				System.out.printf("%d", " ");
				System.out.printf("%d", "\n");
			}
			else
			{
				System.out.printf("%d", " ");
			}
			children = tangible.StringFunctions.changeCharacter(children, left, ' ');
		}
	}
	return 0;
}
int lefts(char * head,char * p)
{
	int left;
	if (*p != boy) //?????????????????
	{
		left = lefts(head,p - 1);
	}
	else
	{
		left = p - head;
	}
	return left;
}

