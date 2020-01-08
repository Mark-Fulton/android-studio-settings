#if (${PACKAGE_NAME} && ${PACKAGE_NAME} != "")package ${PACKAGE_NAME}

#end
#parse("File Header.java")
class ${NAME}Presenter: BaseViewModel() {

    companion object {
        val NULL_VALUE = null
    }

    private lateinit var display: Display
    private lateinit var router: Router

    // region Lifecycle Events
    fun inject(display: Display, router: Router) {
        this.display = display
        this.router = router
    }

    override fun onStart() {

    }

    override fun onPause() {
        
    }

    override fun onStop() {

    }

    override fun onResume() {

    }
    // endregion

    // region Public Methods

    // endregion

    // region Private Methods

    // endregion

    interface Display {

    }

    interface Router {
        fun navigateBackStack()
    }
}