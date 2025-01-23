// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Tasks_of_User implements com.mendix.systemwideinterfaces.core.IEntityProxy
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject tasks_of_UserMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Tasks_of_User";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Title("Title"),
		Description("Description"),
		Created("Created"),
		Status("Status"),
		TaskType("TaskType"),
		DueDate("DueDate"),
		Tasks_of_User_Assets("MyFirstModule.Tasks_of_User_Assets"),
		Tasks_of_User_User("MyFirstModule.Tasks_of_User_User");

		private final java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Tasks_of_User(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, entityName));
	}

	protected Tasks_of_User(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject tasks_of_UserMendixObject)
	{
		if (tasks_of_UserMendixObject == null) {
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		}
		if (!com.mendix.core.Core.isSubClassOf(entityName, tasks_of_UserMendixObject.getType())) {
			throw new java.lang.IllegalArgumentException(String.format("The given object is not a %s", entityName));
		}	

		this.tasks_of_UserMendixObject = tasks_of_UserMendixObject;
		this.context = context;
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 * @param context The context to be used
	 * @param mendixObject The Mendix object for the new instance
	 * @return a new instance of this proxy class
	 */
	public static myfirstmodule.proxies.Tasks_of_User initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Tasks_of_User(context, mendixObject);
	}

	public static myfirstmodule.proxies.Tasks_of_User load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Tasks_of_User.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Tasks_of_User> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		return com.mendix.core.Core.createXPathQuery(String.format("//%1$s%2$s", entityName, xpathConstraint))
			.execute(context)
			.stream()
			.map(obj -> myfirstmodule.proxies.Tasks_of_User.initialize(context, obj))
			.collect(java.util.stream.Collectors.toList());
	}

	/**
	 * @return value of Title
	 */
	public final java.lang.String getTitle()
	{
		return getTitle(getContext());
	}

	/**
	 * @param context
	 * @return value of Title
	 */
	public final java.lang.String getTitle(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Title.toString());
	}

	/**
	 * Set value of Title
	 * @param title
	 */
	public final void setTitle(java.lang.String title)
	{
		setTitle(getContext(), title);
	}

	/**
	 * Set value of Title
	 * @param context
	 * @param title
	 */
	public final void setTitle(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String title)
	{
		getMendixObject().setValue(context, MemberNames.Title.toString(), title);
	}

	/**
	 * @return value of Description
	 */
	public final java.lang.String getDescription()
	{
		return getDescription(getContext());
	}

	/**
	 * @param context
	 * @return value of Description
	 */
	public final java.lang.String getDescription(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Description.toString());
	}

	/**
	 * Set value of Description
	 * @param description
	 */
	public final void setDescription(java.lang.String description)
	{
		setDescription(getContext(), description);
	}

	/**
	 * Set value of Description
	 * @param context
	 * @param description
	 */
	public final void setDescription(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String description)
	{
		getMendixObject().setValue(context, MemberNames.Description.toString(), description);
	}

	/**
	 * @return value of Created
	 */
	public final java.util.Date getCreated()
	{
		return getCreated(getContext());
	}

	/**
	 * @param context
	 * @return value of Created
	 */
	public final java.util.Date getCreated(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.Created.toString());
	}

	/**
	 * Set value of Created
	 * @param created
	 */
	public final void setCreated(java.util.Date created)
	{
		setCreated(getContext(), created);
	}

	/**
	 * Set value of Created
	 * @param context
	 * @param created
	 */
	public final void setCreated(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date created)
	{
		getMendixObject().setValue(context, MemberNames.Created.toString(), created);
	}

	/**
	 * Get value of Status
	 * @param status
	 */
	public final myfirstmodule.proxies.AssetTask getStatus()
	{
		return getStatus(getContext());
	}

	/**
	 * @param context
	 * @return value of Status
	 */
	public final myfirstmodule.proxies.AssetTask getStatus(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.Status.toString());
		if (obj == null) {
			return null;
		}
		return myfirstmodule.proxies.AssetTask.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of Status
	 * @param status
	 */
	public final void setStatus(myfirstmodule.proxies.AssetTask status)
	{
		setStatus(getContext(), status);
	}

	/**
	 * Set value of Status
	 * @param context
	 * @param status
	 */
	public final void setStatus(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.AssetTask status)
	{
		if (status != null) {
			getMendixObject().setValue(context, MemberNames.Status.toString(), status.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.Status.toString(), null);
		}
	}

	/**
	 * Get value of TaskType
	 * @param tasktype
	 */
	public final myfirstmodule.proxies.TaskType getTaskType()
	{
		return getTaskType(getContext());
	}

	/**
	 * @param context
	 * @return value of TaskType
	 */
	public final myfirstmodule.proxies.TaskType getTaskType(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.TaskType.toString());
		if (obj == null) {
			return null;
		}
		return myfirstmodule.proxies.TaskType.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of TaskType
	 * @param tasktype
	 */
	public final void setTaskType(myfirstmodule.proxies.TaskType tasktype)
	{
		setTaskType(getContext(), tasktype);
	}

	/**
	 * Set value of TaskType
	 * @param context
	 * @param tasktype
	 */
	public final void setTaskType(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.TaskType tasktype)
	{
		if (tasktype != null) {
			getMendixObject().setValue(context, MemberNames.TaskType.toString(), tasktype.toString());
		} else {
			getMendixObject().setValue(context, MemberNames.TaskType.toString(), null);
		}
	}

	/**
	 * @return value of DueDate
	 */
	public final java.util.Date getDueDate()
	{
		return getDueDate(getContext());
	}

	/**
	 * @param context
	 * @return value of DueDate
	 */
	public final java.util.Date getDueDate(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.util.Date) getMendixObject().getValue(context, MemberNames.DueDate.toString());
	}

	/**
	 * Set value of DueDate
	 * @param duedate
	 */
	public final void setDueDate(java.util.Date duedate)
	{
		setDueDate(getContext(), duedate);
	}

	/**
	 * Set value of DueDate
	 * @param context
	 * @param duedate
	 */
	public final void setDueDate(com.mendix.systemwideinterfaces.core.IContext context, java.util.Date duedate)
	{
		getMendixObject().setValue(context, MemberNames.DueDate.toString(), duedate);
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Tasks_of_User_Assets
	 */
	public final myfirstmodule.proxies.Assets getTasks_of_User_Assets() throws com.mendix.core.CoreException
	{
		return getTasks_of_User_Assets(getContext());
	}

	/**
	 * @param context
	 * @return value of Tasks_of_User_Assets
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.Assets getTasks_of_User_Assets(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Assets result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tasks_of_User_Assets.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.Assets.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Tasks_of_User_Assets
	 * @param tasks_of_user_assets
	 */
	public final void setTasks_of_User_Assets(myfirstmodule.proxies.Assets tasks_of_user_assets)
	{
		setTasks_of_User_Assets(getContext(), tasks_of_user_assets);
	}

	/**
	 * Set value of Tasks_of_User_Assets
	 * @param context
	 * @param tasks_of_user_assets
	 */
	public final void setTasks_of_User_Assets(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Assets tasks_of_user_assets)
	{
		if (tasks_of_user_assets == null) {
			getMendixObject().setValue(context, MemberNames.Tasks_of_User_Assets.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Tasks_of_User_Assets.toString(), tasks_of_user_assets.getMendixObject().getId());
		}
	}

	/**
	 * @throws com.mendix.core.CoreException
	 * @return value of Tasks_of_User_User
	 */
	public final myfirstmodule.proxies.User getTasks_of_User_User() throws com.mendix.core.CoreException
	{
		return getTasks_of_User_User(getContext());
	}

	/**
	 * @param context
	 * @return value of Tasks_of_User_User
	 * @throws com.mendix.core.CoreException
	 */
	public final myfirstmodule.proxies.User getTasks_of_User_User(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.User result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Tasks_of_User_User.toString());
		if (identifier != null) {
			result = myfirstmodule.proxies.User.load(context, identifier);
		}
		return result;
	}

	/**
	 * Set value of Tasks_of_User_User
	 * @param tasks_of_user_user
	 */
	public final void setTasks_of_User_User(myfirstmodule.proxies.User tasks_of_user_user)
	{
		setTasks_of_User_User(getContext(), tasks_of_user_user);
	}

	/**
	 * Set value of Tasks_of_User_User
	 * @param context
	 * @param tasks_of_user_user
	 */
	public final void setTasks_of_User_User(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.User tasks_of_user_user)
	{
		if (tasks_of_user_user == null) {
			getMendixObject().setValue(context, MemberNames.Tasks_of_User_User.toString(), null);
		} else {
			getMendixObject().setValue(context, MemberNames.Tasks_of_User_User.toString(), tasks_of_user_user.getMendixObject().getId());
		}
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return tasks_of_UserMendixObject;
	}

	@java.lang.Override
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this) {
			return true;
		}
		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Tasks_of_User that = (myfirstmodule.proxies.Tasks_of_User) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

  /**
   * Gives full name ("Module.Entity" name) of the type of the entity.
   *
   * @return the name
   */
	public static java.lang.String getType()
	{
		return entityName;
	}
}
